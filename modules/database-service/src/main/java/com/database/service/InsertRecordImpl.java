package com.database.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.osgi.service.component.annotations.Component;

import com.database.crud.api.InsertRecordApi;
import com.database.service.utils.JDBCUtils;
import com.database.service.utils.SQLExceptionUtils;

@Component(immediate = true, service = InsertRecordApi.class)
public class InsertRecordImpl implements InsertRecordApi {

	private static final String INSERT_BRANCH_OFFICE_SQL = "INSERT INTO Branch_Office" +
	        "  (Name, Address) VALUES (?, ?);";
	
	@Override
	public void insertBranchOffice() {
		System.out.println(INSERT_BRANCH_OFFICE_SQL);
		
		JDBCUtils jdbcUtils = new JDBCUtils();
		
		try(Connection connection = jdbcUtils.getConnections()) {
			
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_BRANCH_OFFICE_SQL);
			preparedStatement.setString(2, "Automotriz");
			preparedStatement.setString(3, "España");
			
			System.out.println(preparedStatement + "query");
			
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			SQLExceptionUtils.printSQLException(e);
		}
		
	}

}
