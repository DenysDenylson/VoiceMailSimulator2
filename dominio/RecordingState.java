
public class RecordingState implements ConnectionState {

    @Override
	public void dial(String key, Connection connection) {
		if (key.equals("#")) {
			if (connection.currentMailbox.checkPasscode(connection.accumulatedKeys)) {
				connection.currentState = new MailboxMenuState();
				connection.speakToAllUIs(Connection.MAILBOX_MENU_TEXT);
			} else
				connection.speakToAllUIs("Incorrect passcode. Try again!");
			connection.accumulatedKeys = "";
		} else
			connection.accumulatedKeys += key;
	}
	
    @Override
	public int getState(){
		return 2;
	}
}
