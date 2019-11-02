package paquete1;

public class Persona {
	private int altura;
	private String nombre;// "cadena"
	private boolean fuma = false; // true
	private char sexo;// ´a´
	private float peso; // 60.5f
	private double sueldo; // 65000d
	private String nacionalidad;
	public Persona padre;
	public Persona madre;
	

	public int getAltura() {

		return altura;
	}

	public void setAltura(int alt) {
		altura = alt;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isFuma() {
		return fuma;
	}

	public void setFuma(boolean fuma) {
		this.fuma = fuma;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public Persona getPadre() {
		return padre;
	}

	public void setPadre(Persona string) {
		this.padre = string;
	}

	public Persona getMadre() {
		return madre;
	}

	public void setMadre(Persona madre) {
		this.madre = madre;
		
	}

}