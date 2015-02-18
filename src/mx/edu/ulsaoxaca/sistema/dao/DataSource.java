package mx.edu.ulsaoxaca.sistema.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataSource {
	private String usuario = "daniel";
	private String contrasena = "12345";
	private String esquema = "java_usuario";
	private String ip = "localhost";
	private String puerto = "3306";
	private String protocolo;
	private String controlador = "com.mysql.jdbc.Driver";
	private Connection conexion;
	
	public DataSource(){
		// Creamos el Driver.
		this.protocolo = "jdbc:mysql://" + this.ip + ":" + this.puerto + "/" + this.esquema;
		try {
			//Registrar el driver.
			Class.forName(this.controlador).newInstance();
			try {
				//Asignamos la conexion.
				this.conexion = DriverManager.getConnection(this.protocolo,this.usuario,this.contrasena);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Metodo que nos obtiene los registros de la base de datos.
	 * @param consulta Sentencia SQL.
	 * @return Registros de nuestra base de datos de 0 a N.
	 */
	public ResultSet ejecutarConsulta(String consulta){
		ResultSet rs = null;
		Statement s = null;
		
		try {
			s = this.conexion.createStatement();
			rs = s.executeQuery(consulta);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	/**
	 * Metodo que nos regresa el numero de tablas afectadas.
	 * @param consulta Sentencia SQL.
	 * @return Numero de tablas afectadas en la base de datos.
	 */
	public int ejecutarActualizacion(String consulta){
		int r = 0;
		Statement s = null;
		try {
			s = this.conexion.createStatement();
			r = s.executeUpdate(consulta);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return r;
		
	}
	
	
}
