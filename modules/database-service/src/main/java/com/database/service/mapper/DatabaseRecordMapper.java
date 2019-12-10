package com.database.service.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.database.dto.BranchOfficeDTO;

public class DatabaseRecordMapper {

	public List<BranchOfficeDTO> toBDBranchOfficeRecord(ResultSet resultSetBD) throws SQLException {
		List<BranchOfficeDTO> branchOffices = new ArrayList<>();

		while (resultSetBD.next()) {
			BranchOfficeDTO branchOfficeDTO = new BranchOfficeDTO();
			
			branchOfficeDTO.setId(resultSetBD.getInt("id"));
			branchOfficeDTO.setName(resultSetBD.getString("name"));
			branchOfficeDTO.setAddress(resultSetBD.getString("address"));
			
			branchOffices.add(branchOfficeDTO);
		}
		return branchOffices;
	}
}
