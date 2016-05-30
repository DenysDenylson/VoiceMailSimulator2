
public class ChangeGreetingState implements ConnectionState {

        @Override
	public void dial(String key, Connection connection) {
		if (key.equals("#")) {
			connection.currentMailbox.setGreeting(connection.currentRecording);
			connection.currentRecording = "";
			connection.currentState = new MailboxMenuState();
			connection.speakToAllUIs(Connection.MAILBOX_MENU_TEXT);
		}
	}

        @Override
	public int getState() {
		return 6;
	}

}
