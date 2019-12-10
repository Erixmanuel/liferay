package com.database.service.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtils {
	
	private static final String DATABASE_ROUTE = System.getProperty("liferay.home") + "/data/";
	
    private static String jdbcURL = "jdbc:hsqldb:file:" + DATABASE_ROUTE + "hypersonic/lportal";
    private static String jdbcUsername = "SA";
    private static String jdbcPassword = "";
    
	public Connection getConnections() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
			
		} catch (SQLException sqlEx) {
			sqlEx.printStackTrace();
		}
		
		return connection;
	}
}
