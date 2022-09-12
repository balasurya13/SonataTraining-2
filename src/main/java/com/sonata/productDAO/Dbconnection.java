package com.sonata.productDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnection {
		Connection connection;
		public Connection getConnection() {
			try {
				Class.forName("");
				connection = DriverManager.getConnection("");
				
			}catch(ClassNotFoundException e){System.out.println(e);}
			catch(SQLException e1) {e1.printStackTrace();}
			return connection;
			
		}
	public void closeconnection() {
		try {
			if(connection!= null)
				connection.close();
			
		}catch(SQLException e) {e.printStackTrace();}
	}
	}


