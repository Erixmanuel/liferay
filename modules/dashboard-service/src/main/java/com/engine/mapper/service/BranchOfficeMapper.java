package com.engine.mapper.service;

import java.util.ArrayList;
import java.util.List;

import com.database.dto.BranchOfficeDTO;
import com.engine.api.model.BranchOfficeDataDTO;

public class BranchOfficeMapper {

	public List<BranchOfficeDataDTO> toBranchOffice(List <BranchOfficeDTO> branchOfficesBD) {
		List<BranchOfficeDataDTO> branchOffices = new ArrayList<>();
		
		for (BranchOfficeDTO branchOfficeDTO : branchOfficesBD) {
			BranchOfficeDataDTO branchOffice = new BranchOfficeDataDTO();
			
			branchOffice.setAddress(branchOfficeDTO.getAddress());
			branchOffice.setBranchOfficeNumber(branchOfficeDTO.getId());
			branchOffice.setName(branchOfficeDTO.getName());
		}
		
		return branchOffices;
	}
}
