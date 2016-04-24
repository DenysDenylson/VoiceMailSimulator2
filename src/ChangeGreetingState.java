
public class ChangeGreetingState implements ConnectionState {

	public void dial(String key, Connection connection) {
		if (key.equals("#")) {
			connection.currentMailbox.setGreeting(connection.currentRecording);
			connection.currentRecording = "";
			connection.state = Connection.MAILBOX_MENU;
			// phone.speak(MAILBOX_MENU_TEXT);
			connection.speakToAllUIs(Connection.MAILBOX_MENU_TEXT);
		}
	}

	public String getState() {
		return "change reeting";
	}

}
