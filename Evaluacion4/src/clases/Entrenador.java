package clases;

public class Entrenador extends SeleccionFutbol {

	private int idFederacion;

    public Entrenador() {
    }

    public Entrenador(int idFederacion, String apellidos, int edad, int id, String Nombre) {
        super(apellidos, edad, id, Nombre);
        this.idFederacion = idFederacion;
    }

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }

	

}