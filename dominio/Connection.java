import java.util.ArrayList;
import java.util.List;

import Messages.Message;

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
	
	public List<String> contactos = new ArrayList<String>();

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

	List<UserInterface> uis = new ArrayList<UserInterface>();
	ConnectionState currentState = null;

	public Connection(MailSystem s) {
		system = s;
		
		
		contactos = new ArrayList<String>();
		contactos.add("denys 111");
		contactos.add("lesly 222");
		contactos.add("oscar 333");
	}

	public void addUI(UserInterface ui) {
		uis.add(ui);
		resetConnection();
	}

	public void dial(String key) {
		currentState.dial(key, this);
	}

	public void record(String voice) {
		if (currentState.getState()== 2 || currentState.getState() == 6 || currentState.getState() == 8)
			currentRecording += voice;
	}

	public void hangup() {
		if (currentState.getState() == 2)
			currentMailbox.addMessage(new Message(currentRecording));
		resetConnection();
	}

	/**
	 * Reset the connection to the initial state and prompt for mailbox number
	 */
	private void resetConnection() {
		currentRecording = "";
		accumulatedKeys = "";
		currentState = new ConnectedState();

		speakToAllUIs(INITIAL_PROMPT);
	}

	void speakToAllUIs(String output) {
		for (UserInterface ui : uis)
			ui.speak(output);
	}

	public boolean isConnected() {
		return currentState.getState() == 1;
	}

	public boolean isRecording() {
		return currentState.getState() == 2;
	}

	public boolean isInMailBoxMenu() {
		return currentState.getState() == 3;
	}

	public boolean isInMessageMenu() {
		return currentState.getState() == 4;
	}

	public boolean isInChangePassword() {
		return currentState.getState() == 5;
	}

	public boolean isInChangeGreeting() {
		return currentState.getState() == 6;
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
