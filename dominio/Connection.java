import java.util.ArrayList;
import java.util.List;

/**
 * Connects a phone to the mail system. The purpose of this class is to keep
 * track of the state of a connection, since the phone itself is just a source
 * of individual key presses.
 */
public class Connection {

	MailSystem system;
	Mailbox currentMailbox;
	String currentRecording;
	String accumulatedKeys;
	
	public List<String> contactos;

	int state;

	private static final int DISCONNECTED = 0;
	private static final int CONNECTED = 1;
	static final int RECORDING = 2;
	static final int MAILBOX_MENU = 3;
	static final int MESSAGE_MENU = 4;
	static final int CHANGE_PASSCODE = 5;
	static final int CHANGE_GREETING = 6;
	static final int CONTACT_MENU = 7;
	static final int CREATED_CONTACT = 8;
	
	
	
	private static final String INITIAL_PROMPT = "Enter mailbox number followed by #";
	
	static final String MAILBOX_MENU_TEXT = 
			"Enter 1 to listen to your messages\n" 
			+ "Enter 2 to change your passcode\n"
			+ "Enter 3 to change your greeting\n"
	        + "Enter 4 to view your contacts";
	
	static final String MESSAGE_MENU_TEXT = 
			"Enter 1 to listen to the current message\n"
	         + "Enter 2 to save the current message\n"
	         + "Enter 3 to delete the current message\n"
	         + "Enter 4 to return to the main menu";
	
	static final String CONTACT_MENU_TEXT = 
	           "Enter 1 to view list contacts\n"
	         + "Enter 2 to create the contact\n"
	         + "Enter 3 to delete the contact\n"
	         + "Enter 4 to return to the main menu";

	List<UserInterface> uis;
	ConnectionState currentState = null;

	public Connection(MailSystem s, List uis) {
		this.uis = uis;
		system = s;
		resetConnection();
		
		contactos = new ArrayList<String>();
		contactos.add("denys 111");
		contactos.add("denys 222");
		contactos.add("denys 333");
	}

	public void addUI(UserInterface ui) {
		uis.add(ui);
	}

	public void dial(String key) {
		if (state == CONNECTED) {
			currentState = new ConnectedState();
		} else if (state == RECORDING) {
			currentState = new RecordingState();
		} else if (state == CHANGE_PASSCODE) {
			currentState = new ChangePasscodeState();
		} else if (state == CHANGE_GREETING) {
			currentState = new ChangeGreetingState();
		} else if (state == MAILBOX_MENU) {
			currentState = new MailboxMenuState();
		} else if (state == MESSAGE_MENU) {
			currentState = new MessageMenuState();
		} else if (state == CONTACT_MENU) {
			currentState = new ContactMenuState();
		} else if (state == CREATED_CONTACT) {
			currentState = new CreatedContactState();
		}
		currentState.dial(key, this);
	}

	public void record(String voice) {
		if (state == RECORDING || state == CHANGE_GREETING)
			currentRecording += voice;
	}

	public void hangup() {
		if (state == RECORDING)
			currentMailbox.addMessage(new Message(currentRecording));
		resetConnection();
	}

	/**
	 * Reset the connection to the initial state and prompt for mailbox number
	 */
	private void resetConnection() {
		currentRecording = "";
		accumulatedKeys = "";
		state = CONNECTED;

		speakToAllUIs(INITIAL_PROMPT);
	}

	void speakToAllUIs(String output) {
		for (UserInterface ui : uis)
			ui.speak(output);
	}

	public boolean isConnected() {
		return state == CONNECTED;
	}

	public boolean isRecording() {
		return state == RECORDING;
	}

	public boolean isInMailBoxMenu() {
		return state == MAILBOX_MENU;
	}

	public boolean isInMessageMenu() {
		return state == MESSAGE_MENU;
	}

	public boolean isInChangePassword() {
		return state == CHANGE_PASSCODE;
	}

	public boolean isInChangeGreeting() {
		return state == CHANGE_GREETING;
	}
	
	public String getContacts(){
		String listaDeContactos = "";
		
		for (String contacto : contactos)
			listaDeContactos += contacto + "\n";
		return listaDeContactos;
	}
	
	public boolean setContact(String contact){
		contactos.add(contact);
		return true;
	}


}
