package entornos;

public class Usuario {

	String nombre;
	String dni;
	int edad;

	public Usuario() {

		nombre = "";
		dni = "";
		edad = 0;

	}

	public Usuario(Usuario u) {

		nombre = u.nombre;
		dni = u.dni;
		edad = u.edad;

	}

	public Usuario(String n, String d, int i) {

		nombre = n;
		dni = d;
		edad = i;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {

		return edad;
	}

	public void setEdad(int edad) {

		this.edad = edad;
	}

}
