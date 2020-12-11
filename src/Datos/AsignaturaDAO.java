package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import Entidades.Asignatura;
import Entidades.IAsignaturaDAO;

public class AsignaturaDAO implements IAsignaturaDAO{

	@Override
	public void insertar(Asignatura asignatura) {
		
		ConexionMySQL con = new ConexionMySQL();
		Connection c= con.crearConexion();
		con.cargarDriver();
		
		/*HACER PREPARED STATEMENT*/String consulta = "INSERT INTO ASIGNATURA" + "(ID,NOMBRE,HORASSEMANALES) VALUES" + "('000000000', 'ACCESO A DATOS', '8')," + "('111111111', 'INTERFACES', '7')," + 
		"('222222222', 'BASES DE DATOS', '5')," + "('333333333', 'EMPRESA E INICIATIVA', '3')," + "('4444444444', 'SISTEMAS INFORMATICOS', '6');";
		
		Statement s;
		try {
			s = c.createStatement();
			
			
			s.executeUpdate(consulta);
			s.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

	@Override
	public void eliminar(Asignatura asignatura) {
		// TODO Auto-generated method stub
		ConexionMySQL c = new ConexionMySQL();
	}

	@Override
	public void modificar(Asignatura asignatura) {
		// TODO Auto-generated method stub
		ConexionMySQL c = new ConexionMySQL();
	}

}
