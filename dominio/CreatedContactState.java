
public class CreatedContactState implements ConnectionState {

	@Override
	public void dial(String key, Connection connection) {
		if (key.equals("#") != true) {
//			connection.speakToAllUIs(key+"ppppppppppppppppp");
//			connection.setContact(key+"aaaa");
			connection.contactos.add(key);
//			connection.accumulatedKeys = "";
//			connection.state = Connection.CONTACT_MENU;
//			connection.speakToAllUIs(Connection.CONTACT_MENU_TEXT);
		}else{
			connection.state = Connection.CONTACT_MENU;
			connection.speakToAllUIs(Connection.CONTACT_MENU_TEXT);
		}
	}

	@Override
	public String getState() {
		// TODO Auto-generated method stub
		return null;
	}

}