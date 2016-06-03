public class CreatedContactState implements ConnectionState {

	@Override
	public void dial(String key, Connection connection) {
		if (key.equals("#")) {
			Contacto contacto_nuevo = new Contacto(connection.currentRecording, connection.currentRecording);
			connection.setContact(contacto_nuevo);
			
			
			String nombre = connection.currentRecording;
			String numero = "555";
					
			String sql = "INSERT INTO Contactos (id, nombres, numero) " + "VALUES (1, '"+ nombre +"', '"+ numero +"')";
			connection.bd.Insertar(sql);
			
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
