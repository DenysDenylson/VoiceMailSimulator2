import java.sql.SQLException;

import Messages.Message;

public class MessageMenuState implements ConnectionState {

        @Override
	public void dial(String key, Connection connection) {
		if (key.equals("1")) {
			String output = "";
//			Message m = connection.currentMailbox.getCurrentMessage();
//			if (m == null)
//				output += "No messages." + "\n";
//			else
//				output += m.getText() + "\n";
			
			output = recuperarMensajeDeBD(connection);
			
			output += Connection.MESSAGE_MENU_TEXT;
			connection.speakToAllUIs(output);
			
		} else if (key.equals("2")) {
			connection.currentMailbox.saveCurrentMessage();
			guardarMensajeEnBD(connection);
			connection.speakToAllUIs(Connection.MESSAGE_MENU_TEXT);
		} else if (key.equals("3")) {
			connection.currentMailbox.removeCurrentMessage();
			connection.speakToAllUIs(Connection.MESSAGE_MENU_TEXT);
		} else if (key.equals("4")) {
			connection.currentState = new MailboxMenuState();
			connection.speakToAllUIs(Connection.MAILBOX_MENU_TEXT);
		}
	}
	
        @Override
	public int getState(){
		return 4;
	}
        
    public void guardarMensajeEnBD(Connection connection) {
    	Message mensaje = connection.currentMailbox.getCurrentMessage();
		String sql = "INSERT INTO Mensajes (id, mensaje) " + "VALUES (2, '"+ mensaje.getText() +"')";
		connection.bd.Insertar(sql);
    }
    
    public String recuperarMensajeDeBD(Connection connection) {
    	String listaDeMensajes = "";
		
		javax.swing.DefaultListModel tem = new javax.swing.DefaultListModel();
		
		try {
            java.sql.ResultSet hoja_resultados = null;
            String sql = "select * from Mensajes";
            hoja_resultados = connection.bd.Consulta(sql);
            
            while(hoja_resultados.next())
                tem.addElement(hoja_resultados.getString("id")+"     "+hoja_resultados.getString("mensaje"));
        } catch (SQLException e) {
            System.out.println("Error con el SQL");
        }
		Integer tamanho =  tem.size();
		
		for(Integer i=0; i<tamanho; i++)
			listaDeMensajes += tem.get(i) + "\n";
        return listaDeMensajes;
    }
}
