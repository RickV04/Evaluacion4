package clases;

public class Futbolista extends SeleccionFutbol {

	private String demarcacion;
	private int dorsal;

    public Futbolista() {
    }

    public Futbolista(String demarcacion, int dorsal, String apellidos, int edad, int id, String Nombre) {
        super(apellidos, edad, id, Nombre);
        this.demarcacion = demarcacion;
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

	

	
}