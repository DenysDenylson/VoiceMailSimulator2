
public class ContactMenuState implements ConnectionState {

	@Override
	public void dial(String key, Connection c) {
		if (key.equals("1")) {

		} else if (key.equals("2")) {
			
		} else if (key.equals("3")) {
			
		} else if (key.equals("4")) {
			c.state = Connection.MAILBOX_MENU;
			c.speakToAllUIs(Connection.MAILBOX_MENU_TEXT);
		}
		
	}

	@Override
	public String getState() {
		// TODO Auto-generated method stub
		return null;
	}

}
