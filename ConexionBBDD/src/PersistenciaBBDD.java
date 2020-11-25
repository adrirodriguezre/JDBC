import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class PersistenciaBBDD {

	public static void main(String[] args) throws SQLException {
		
		PersistenciaBBDD pb = new PersistenciaBBDD();
		pb.obtenerConexion();
		
	}
		private void cargarDriver() throws ClassNotFoundException {
			
			Class.forName("org.gjt.mm.mysql.Driver");
		}
		
		public Connection obtenerConexion() throws SQLException {
			
			
			String url = "jdbc:mysql://localhost:3307/ejerciciobbdd?useSSL=false";
			String usuario = "root";
			String pass = "1234";
			Connection c = (Connection) DriverManager.getConnection(url,usuario,pass);
			c.close();
			System.out.println(c);
			return c;
		}

	}
