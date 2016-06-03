
public class Contacto {
	String nombre;
	String numero;
	
	public Contacto(String name, String num) {
		this.nombre = name;
		this.numero = num;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
}
