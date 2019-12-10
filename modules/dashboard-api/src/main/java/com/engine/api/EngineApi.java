package com.engine.api;

import java.util.List;

import com.engine.api.model.BranchOfficeDataDTO;

/**
 * @author erhernandez
 */
public interface EngineApi {
	
	public List<BranchOfficeDataDTO> getBranchOffice();
}