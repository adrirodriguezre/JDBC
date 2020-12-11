package Entidades;

public class Ciclo {
	
	private int idCiclo;
	private String nombreCiclo;
	private String grado;
	
	//GETTERS Y SETTERS
	public int getIdCiclo() {
		return idCiclo;
	}
	public void setIdCiclo(int idCiclo) {
		this.idCiclo = idCiclo;
	}
	public String getNombreCiclo() {
		return nombreCiclo;
	}
	public void setNombreCiclo(String nombreCiclo) {
		this.nombreCiclo = nombreCiclo;
	}
	public String getGrado() {
		return grado;
	}
	public void setGrado(String grado) {
		this.grado = grado;
	}
	
	//CONSTRUCTOR
	public Ciclo(int idCiclo, String nombreCiclo, String grado) {
		super();
		this.idCiclo = idCiclo;
		this.nombreCiclo = nombreCiclo;
		this.grado = grado;
	}
	
	
	
	

}
