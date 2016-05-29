
public class ContactMenuState implements ConnectionState {

		@Override
	public void dial(String key, Connection c) {
		if (key.equals("1")) {
			System.out.println("Denus");
//			String output = "Denyslons\n";
//			output += Connection.CONTACT_MENU_TEXT;
//			c.speakToAllUIs(output);
		} else if (key.equals("2")) {
			System.out.println("Denus");
		} else if (key.equals("3")) {
			System.out.println("Denus");
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
