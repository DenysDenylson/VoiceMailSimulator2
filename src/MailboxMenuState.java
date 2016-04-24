
public class MailboxMenuState implements ConnectionState {
	
	public void dial(String key, Connection connection) {
		if (key.equals("1")) {
			connection.state = Connection.MESSAGE_MENU;
			connection.speakToAllUIs(Connection.MESSAGE_MENU_TEXT);
		} else if (key.equals("2")) {
			connection.state = Connection.CHANGE_PASSCODE;
			connection.speakToAllUIs("Enter new passcode followed by the # key");
		} else if (key.equals("3")) {
			connection.state = Connection.CHANGE_GREETING;
			connection.speakToAllUIs("Record your greeting, then press the # key");
		}
	}
	
	public String getState(){
		return "mailbox menu";
	}

}
