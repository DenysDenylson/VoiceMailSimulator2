import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class _ConnectionTest {

	@Test
	public void newConnectionShouldBeConnected() {
		MailSystem system = mock(MailSystem.class);
		Telephone phone = mock(Telephone.class);
		Connection conn = new Connection(system, phone);

		verify(phone).speak("Enter mailbox number followed by #");
		assertTrue(conn.isConnected());
	}

	@Test
	public void whenDialInAConnectedStateItShouldChangeToRecording() {
		MailSystem system = mock(MailSystem.class);
		Telephone phone = mock(Telephone.class);
		Connection conn = new Connection(system, phone);
		Mailbox mailbox = mock(Mailbox.class);

		when(system.findMailbox("1")).thenReturn(mailbox);
		when(mailbox.getGreeting()).thenReturn("Hola mailbox");

		conn.dial("1");
		conn.dial("#");

		verify(phone).speak("Hola mailbox");
		assertTrue(conn.isRecording());
	}

	@Test
	public void whenDialInAConnectedStateAndNoMailboxFoundItShouldShowAnErrorMessage() {
		MailSystem system = mock(MailSystem.class);
		Telephone phone = mock(Telephone.class);
		Connection conn = new Connection(system, phone);

		when(system.findMailbox("10")).thenReturn(null);

		conn.dial("10");
		conn.dial("#");

		verify(phone).speak("Incorrect mailbox number. Try again!");
	}

	@Test
	public void test1() {//verifica la verificacion del pasccode si es correcto 
		MailSystem system = mock(MailSystem.class);
		Telephone phone = mock(Telephone.class);
		Connection conn = new Connection(system, phone);
		Mailbox currentMailbox = mock(Mailbox.class);
		String mailboxText = "Enter 1 to listen to your messages\n" + "Enter 2 to change your passcode\n"
				+ "Enter 3 to change your greeting";

		when(system.findMailbox("1")).thenReturn(currentMailbox);
		when(currentMailbox.checkPasscode("1")).thenReturn(true);

		conn.dial("1");
		conn.dial("#");
		conn.dial("1");
		conn.dial("#");

		assertTrue(conn.isInMailBoxMenu());
		verify(phone).speak(mailboxText);

	}

	@Test
	public void test2() {//verifica la verificacion del pasccode si es incorrecto 
		MailSystem system = mock(MailSystem.class);
		Telephone phone = mock(Telephone.class);
		Connection conn = new Connection(system, phone);
		Mailbox currentMailbox = mock(Mailbox.class);
		String mailboxText = "Incorrect passcode. Try again!";

		when(system.findMailbox("1")).thenReturn(currentMailbox);
		when(currentMailbox.checkPasscode("2")).thenReturn(false);

		conn.dial("1");
		conn.dial("#");
		conn.dial("2");
		conn.dial("#");

		assertFalse(conn.isInMailBoxMenu());
		verify(phone).speak(mailboxText);

	}

	@Test
	public void getIntoChangePasscodeOption() {//prueba del cambio de codigo de acceso de la opcion 2
		MailSystem system = mock(MailSystem.class);
		Telephone phone = mock(Telephone.class);
		Connection conn = new Connection(system, phone);
		Mailbox currentMailbox = mock(Mailbox.class);

		when(system.findMailbox("1")).thenReturn(currentMailbox);
		when(currentMailbox.checkPasscode("1")).thenReturn(true);

		conn.dial("1");
		conn.dial("#");
		conn.dial("1");
		conn.dial("#");
		conn.dial("2");
		verify(phone).speak("Enter new passcode followed by the # key");
	}
	
	@Test
	public void test3() {//prueba el cambio de saludo de la opcion 3
		MailSystem system = mock(MailSystem.class);
		Telephone phone = mock(Telephone.class);
		Connection conn = new Connection(system, phone);
		Mailbox currentMailbox = mock(Mailbox.class);

		when(system.findMailbox("1")).thenReturn(currentMailbox);
		when(currentMailbox.checkPasscode("1")).thenReturn(true);

		conn.dial("1");
		conn.dial("#");
		conn.dial("1");
		conn.dial("#");
		
		conn.dial("3"); 
		verify(phone).speak("Record your greeting, then press the # key");
	}
	
	@Test
	public void test4() {//verifica el menu del messagemenutext al poner la opcion 1
		MailSystem system = mock(MailSystem.class);
		Telephone phone = mock(Telephone.class);
		Connection conn = new Connection(system, phone);
		Mailbox currentMailbox = mock(Mailbox.class);

		when(system.findMailbox("1")).thenReturn(currentMailbox);
		when(currentMailbox.checkPasscode("1")).thenReturn(true);

		conn.dial("1");
		conn.dial("#");
		conn.dial("1");
		conn.dial("#");
		conn.dial("1"); 
		verify(phone).speak("Enter 1 to listen to the current message\n"
		         + "Enter 2 to save the current message\n"
		         + "Enter 3 to delete the current message\n"
		         + "Enter 4 to return to the main menu");
	}
	

	@Test
	public void test5() {//verifica cuando ingresa una opcion invalida del mailboxmenu
		MailSystem system = mock(MailSystem.class);
		Telephone phone = mock(Telephone.class);
		Connection conn = new Connection(system, phone);
		Mailbox currentMailbox = mock(Mailbox.class);

		when(system.findMailbox("1")).thenReturn(currentMailbox);
		when(currentMailbox.checkPasscode("1")).thenReturn(true);

		conn.dial("1");
		conn.dial("#");
		conn.dial("1");
		conn.dial("#");
		conn.dial("#");
		verify(phone).speak("Enter 1 to listen to your messages\n"
         + "Enter 2 to change your passcode\n"
         + "Enter 3 to change your greeting");
	}

	@Test
	public void test6() {//verifica el messagemenu
		MailSystem system = mock(MailSystem.class);
		Telephone phone = mock(Telephone.class);
		Connection conn = new Connection(system, phone);
		Mailbox currentMailbox = mock(Mailbox.class);

		when(system.findMailbox("1")).thenReturn(currentMailbox);
		when(currentMailbox.checkPasscode("1")).thenReturn(true);

		conn.dial("1");
		conn.dial("#");
		conn.dial("1");
		conn.dial("#");
		conn.dial("1"); 
		conn.dial("#");
		conn.dial("1");
		verify(phone).speak("Enter 1 to listen to the current message\n"
		         + "Enter 2 to save the current message\n"
		         + "Enter 3 to delete the current message\n"
		         + "Enter 4 to return to the main menu");
	}
	
	@Test
	public void test6_1() {//verifica un mensaje vacio
		MailSystem system = mock(MailSystem.class);
		Telephone phone = mock(Telephone.class);
		Connection conn = new Connection(system, phone);
		Mailbox currentMailbox = mock(Mailbox.class);

		when(system.findMailbox("1")).thenReturn(currentMailbox);
		when(currentMailbox.checkPasscode("1")).thenReturn(true);
		when(currentMailbox.getCurrentMessage()).thenReturn(null);

		conn.dial("1");
		conn.dial("#");
		conn.dial("1"); 
		conn.dial("#");
		conn.dial("1");
		verify(phone).speak("Enter 1 to listen to the current message\n"
		         + "Enter 2 to save the current message\n"
		         + "Enter 3 to delete the current message\n"
		         + "Enter 4 to return to the main menu");
		
		conn.dial("1");
		
		verify(phone).speak("No messages.\n" 
		         + "Enter 1 to listen to the current message\n"
		         + "Enter 2 to save the current message\n"
		         + "Enter 3 to delete the current message\n"
		         + "Enter 4 to return to the main menu");
	}
	
	@Test
	public void test6_2() { //verifica un mensaje sin guardar
		MailSystem system = mock(MailSystem.class);
		Telephone phone = mock(Telephone.class);
		Connection conn = new Connection(system, phone);
		Mailbox currentMailbox = mock(Mailbox.class);
		
		Message message = new Message("hola");
		
		currentMailbox.addMessage(message);

		when(system.findMailbox("1")).thenReturn(currentMailbox);
		when(currentMailbox.checkPasscode("1")).thenReturn(true);
		when(currentMailbox.getCurrentMessage()).thenReturn(message);
		
		conn.dial("1");
		conn.dial("#");
		conn.dial("1");
		conn.dial("#"); 
		conn.dial("1");
	
		verify(phone).speak("Enter 1 to listen to the current message\n"
		         + "Enter 2 to save the current message\n"
		         + "Enter 3 to delete the current message\n"
		         + "Enter 4 to return to the main menu");
		conn.dial("1");
		verify(phone).speak("hola\n" 
		         + "Enter 1 to listen to the current message\n"
		         + "Enter 2 to save the current message\n"
		         + "Enter 3 to delete the current message\n"
		         + "Enter 4 to return to the main menu");
	}
	
	@Test
	public void test7() {//escuchar mensaje actual
		MailSystem system = mock(MailSystem.class);
		Telephone phone = mock(Telephone.class);
		Connection conn = new Connection(system, phone);
		Mailbox currentMailbox = mock(Mailbox.class);
		
		Message message = new Message("Hola mundo");
		
		currentMailbox.addMessage(message);

		when(system.findMailbox("1")).thenReturn(currentMailbox);
		when(currentMailbox.checkPasscode("1")).thenReturn(true);

		conn.dial("1");
		conn.dial("#");
		conn.dial("1");
		conn.dial("#");
		conn.dial("1"); 
		conn.dial("2");
//		conn.dial("1");
		verify(phone, times(2)).speak("Enter 1 to listen to the current message\n"
		         + "Enter 2 to save the current message\n"
		         + "Enter 3 to delete the current message\n"
		         + "Enter 4 to return to the main menu");
	}
	
	@Test
	public void test8() {//escuchar mensaje actual
		MailSystem system = mock(MailSystem.class);
		Telephone phone = mock(Telephone.class);
		Connection conn = new Connection(system, phone);
		Mailbox currentMailbox = mock(Mailbox.class);
		
		Message message = new Message("Hola mundo");
		
		currentMailbox.addMessage(message);

		when(system.findMailbox("1")).thenReturn(currentMailbox);
		when(currentMailbox.checkPasscode("1")).thenReturn(true);

		conn.dial("1");
		conn.dial("#");
		conn.dial("1");
		conn.dial("#");
		conn.dial("1"); 
		conn.dial("3");
//		conn.dial("1");
		verify(phone, times(2)).speak("Enter 1 to listen to the current message\n"
		         + "Enter 2 to save the current message\n"
		         + "Enter 3 to delete the current message\n"
		         + "Enter 4 to return to the main menu");
	}
	
	@Test
	public void test9() {//escuchar mensaje actual
		MailSystem system = mock(MailSystem.class);
		Telephone phone = mock(Telephone.class);
		Connection conn = new Connection(system, phone);
		Mailbox currentMailbox = mock(Mailbox.class);
		
		Message message = new Message("Hola mundo");
		
		currentMailbox.addMessage(message);

		when(system.findMailbox("1")).thenReturn(currentMailbox);
		when(currentMailbox.checkPasscode("1")).thenReturn(true);

		conn.dial("1");
		conn.dial("#");
		conn.dial("1");
		conn.dial("#");
		conn.dial("1"); 
		conn.dial("4");
//		conn.dial("1");
		verify(phone, times(2)).speak("Enter 1 to listen to your messages\n"
		         + "Enter 2 to change your passcode\n"
		         + "Enter 3 to change your greeting");
	}
	
//	@Test
//	public void test10() {//escuchar mensaje actual
//		MailSystem system = mock(MailSystem.class);
//		Telephone phone = mock(Telephone.class);
//		Connection conn = new Connection(system, phone);
//		Mailbox currentMailbox = mock(Mailbox.class);
//		
////		Message message = new Message("Hola mundo");
////		
////		currentMailbox.addMessage(message);
//
//		when(system.findMailbox("1")).thenReturn(currentMailbox);
//		when(currentMailbox.checkPasscode("1")).thenReturn(true);
//
//		conn.dial("1");
//		conn.dial("#");
//		conn.dial("1");
//		conn.dial("#");
//		conn.dial("2");
//		
//		verify(phone).speak("Enter new passcode followed by the # key");
//	}
	
}
