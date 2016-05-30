
public class CreatedContactState implements ConnectionState {

	@Override
	public void dial(String key, Connection connection) {
		if (key.equals("#")) {
//			System.out.println(connection.accumulatedKeys);
			if (connection.setContact(connection.accumulatedKeys)) {
				connection.state = Connection.CONTACT_MENU;
				connection.speakToAllUIs(Connection.CONTACT_MENU_TEXT);
			} else
				connection.speakToAllUIs("Fail. Try again!");
			connection.accumulatedKeys = "";
		} else
			connection.accumulatedKeys += key;

	}

	@Override
	public String getState() {
		// TODO Auto-generated method stub
		return null;
	}

}
