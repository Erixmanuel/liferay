package com.database.crud.api;

import java.util.List;

import com.database.dto.BranchOfficeDTO;

public interface ReadRecordApi {

	public List<BranchOfficeDTO> readBranchOffice();
}
