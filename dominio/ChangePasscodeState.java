
public class ChangePasscodeState implements ConnectionState {

        @Override
	public void dial(String key, Connection connection) {
		if (key.equals("#")) {
			connection.currentMailbox.setPasscode(connection.accumulatedKeys);
			connection.currentState = new MailboxMenuState();
			connection.speakToAllUIs(Connection.MAILBOX_MENU_TEXT);
			connection.accumulatedKeys = "";
		} else
			connection.accumulatedKeys += key;
	}
	
        @Override
	public int getState(){
		return 5;
	}

}
