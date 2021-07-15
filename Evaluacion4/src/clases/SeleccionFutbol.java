package clases;

public class SeleccionFutbol {

	private String apellidos;
	private int edad;
	private int id;
	private String Nombre;

	public SeleccionFutbol(){

	}

    public SeleccionFutbol(String apellidos, int edad, int id, String Nombre) {
        this.apellidos = apellidos;
        this.edad = edad;
        this.id = id;
        this.Nombre = Nombre;
    }
    
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "SeleccionFutbol{" + "apellidos=" + apellidos + ", edad=" + edad + ", id=" + id + ", Nombre=" + Nombre + '}';
    }
    
    

}