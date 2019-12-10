package com.database.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.osgi.service.component.annotations.Component;

import com.database.crud.api.ReadRecordApi;
import com.database.dto.BranchOfficeDTO;
import com.database.service.mapper.DatabaseRecordMapper;
import com.database.service.utils.JDBCUtils;
import com.database.service.utils.SQLExceptionUtils;

@Component(immediate = true, service = ReadRecordApi.class)
public class ReadRecordImpl implements ReadRecordApi {

	private static final String QUERY_BRANCH_OFFICE = "select id,name,email,country,password from users where id =?";

	private DatabaseRecordMapper databaseRecordMapper;

	public ReadRecordImpl() throws SQLException {
		this.databaseRecordMapper = new DatabaseRecordMapper();
	}

	@Override
	public List<BranchOfficeDTO> readBranchOffice() {
		List<BranchOfficeDTO> branchOffice = new ArrayList<>();
		
		JDBCUtils jdbcUtils = new JDBCUtils();
		
		try (Connection connection = jdbcUtils.getConnections()) {

			PreparedStatement preparedStatement = connection.prepareStatement(QUERY_BRANCH_OFFICE);
			preparedStatement.setInt(1, 1);
			System.out.println(preparedStatement);

			branchOffice = databaseRecordMapper.toBDBranchOfficeRecord(preparedStatement.executeQuery());

		} catch (SQLException e) {
			SQLExceptionUtils.printSQLException(e);
		}

		return branchOffice;
	}

}
