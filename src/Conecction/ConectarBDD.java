package Conecction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConectarBDD {


		public static Connection obtenerconexion() throws Exception{	
			//1-CREAR CONEXION
			String driver="com.mysql.jbdc.Driver";
		Connection miconexion= DriverManager.getConnection("jbdc:mysql://localhost:3306/ejercicios","root", "");	
			//2-CREAR STATEMENT
		
		//Statement miStatement=miconexion.createStatement();
		
			//3- ejecutar consulta
		//ResultSet miResultset=miStatement.executeQuery("SELECT * FROM listado");
		
			Class.forName(driver);
			
			
			return miconexion;
		
		
	}
		
		
	

}
