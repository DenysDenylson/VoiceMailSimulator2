import java.util.ArrayList;
import java.util.List;

public class ContactMenuState implements ConnectionState {
	
	
	public ContactMenuState() {
	}

		@Override
	public void dial(String key, Connection c) {
		if (key.equals("1")) {
			String output = "";
			output = c.getContacts();
			output += Connection.CONTACT_MENU_TEXT;
			c.speakToAllUIs(output);
		} else if (key.equals("2")) {
			c.speakToAllUIs("Insertar contacto #");
//			c.setContact(c.currentRecording);
//			c.currentRecording = "";
//			c.state = Connection.CONTACT_MENU;
			c.speakToAllUIs(c.currentRecording+"auiq");
		} else if (key.equals("3")) {
			System.out.println("Denus");
		} else if (key.equals("4")) {
			c.currentState = new MailboxMenuState();
			c.speakToAllUIs(Connection.MAILBOX_MENU_TEXT);
		}
		
	}

	@Override
	public int getState() {
		// TODO Auto-generated method stub
		return 7;
	}
}
