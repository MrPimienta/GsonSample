package dad.maven.gson;

public class Persona {
	private String nombre;
	private String apellidos;
	private int edad;
	
	
	public Persona(String nombre, String apellidos, int edad){
		/*if(((Object)nombre).getClass().getSimpleName() == "String" && 
		   ((Object)apellidos).getClass().getSimpleName() == "String" &&
		   ((Object)edad).getClass().getSimpleName() == "Integer"){}*/
				this.nombre=nombre;
				this.apellidos=apellidos;
				this.edad=edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public int getEdad() {
		return edad;
	}
	
	
}
