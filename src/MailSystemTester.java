import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.sql.SQLException;

import java.util.logging.Level;
import java.util.logging.Logger;
/**
   This program tests the mail system. A single phone
   communicates with the program through System.in/System.out.
*/
public class MailSystemTester
{

   private static final int MAILBOX_COUNT = 20;
   
   public static void main(String[] args){
	   
      MailSystem system = new MailSystem(MAILBOX_COUNT);
      Scanner console = new Scanner(System.in);
      
      UserInterface consola = new Telephone(console);
      UserInterface fone = new TelephoneGUI();
      
      Connection c = new Connection(system);
      
      c.addUI(consola);
      c.addUI(fone);
      
      fone.run(c);
      consola.run(c);
	   
//	   int id = 1;
//	   String nombre = "denys-111";
//	   Conexion con = new Conexion();
//	   String sql = "INSERT INTO Contactos (id,nombres) " + "VALUES (2, 'Paola')";
//	   con.Insertar(sql);
   }
}
