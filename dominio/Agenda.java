import java.util.ArrayList;

public class Agenda {
	ArrayList<Contacto> contactos;
	
	public Agenda() {
		contactos = new ArrayList<Contacto>();
	}
	
	public void insertarContacto(Contacto nombre) {
		contactos.add(nombre);
	}
	
	public void mostrar() {
		
	}
}
