public class MailboxMenuState implements ConnectionState {
	
        @Override
	public void dial(String key, Connection connection) {
		if (key.equals("1")) {
			connection.currentState = new MessageMenuState();
			connection.speakToAllUIs(Connection.MESSAGE_MENU_TEXT);
		} else if (key.equals("2")) {
			connection.currentState = new ChangePasscodeState();
			connection.speakToAllUIs("Enter new passcode followed by the # key");
		} else if (key.equals("3")) {
			connection.currentState = new ChangeGreetingState();
			connection.speakToAllUIs("Record your greeting, then press the # key");
		} else if (key.equals("4")) {
			connection.currentState = new ContactMenuState();;
			connection.speakToAllUIs(Connection.CONTACT_MENU_TEXT);
		}
	}
	
        @Override
	public int getState(){
		return 3;
	}

}
