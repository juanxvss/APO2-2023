package taller;

public class trabajadores {
	private String nombre;
	private String section = "Admin";
	private int id;
	private static int idNext = 1;
	
	public trabajadores(String name) {
		setName(name);
		id = idNext;
		idNext++;
	}


	public String devolverDatos() {
		return "su nombre es: " + getName() + "el admin es: " + getSection() + " y el ID: " + getId();
	}
	
	public static String IdSiguiente() {
		return "El siguiente ID es: " + getIdNext();
	}
	
	public void cambiarSeccionn(String section) {
		setSection(section);
	}

	public String getName() {
		return nombre;
	}

	public void setName(String name) {
		this.nombre = name;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getIdNext() {
		return idNext;
	}

	public static void setIdNext(int idNext) {
		trabajadores.idNext = idNext;
	



	}	
}