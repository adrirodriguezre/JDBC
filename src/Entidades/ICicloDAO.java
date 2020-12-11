package Entidades;

public interface ICicloDAO {

	public void insertar (Ciclo ciclo);
	public void eliminar (Ciclo ciclo);
	public void modificar (Ciclo ciclo);
	public void crearCiclo(Ciclo ciclo, arrayAsignaturas);
}
