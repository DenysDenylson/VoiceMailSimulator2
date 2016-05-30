
public class CreatedContactState implements ConnectionState {

	@Override
	public void dial(String key, Connection connection) {
		if (key.equals("#")) {
			
			connection.setContact(connection.currentRecording);
			connection.currentRecording = "";
			connection.currentState = new ContactMenuState();
			connection.speakToAllUIs(Connection.CONTACT_MENU_TEXT);
		}
	}

	@Override
	public int getState() {
		return 8;
	}

}
