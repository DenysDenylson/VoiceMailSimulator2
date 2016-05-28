
public class ChangePasscodeState implements ConnectionState {

        @Override
	public void dial(String key, Connection connection) {
		if (key.equals("#")) {
			connection.currentMailbox.setPasscode(connection.accumulatedKeys);
			connection.state = Connection.MAILBOX_MENU;
			// phone.speak(MAILBOX_MENU_TEXT);
			connection.speakToAllUIs(Connection.MAILBOX_MENU_TEXT);
			connection.accumulatedKeys = "";
		} else
			connection.accumulatedKeys += key;
	}
	
        @Override
	public String getState(){
		return "change passcode";
	}

}
