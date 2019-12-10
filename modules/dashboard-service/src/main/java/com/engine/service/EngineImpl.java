package com.engine.service;

import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.database.crud.api.ReadRecordApi;
import com.engine.api.EngineApi;
import com.engine.api.model.BranchOfficeDataDTO;
import com.engine.mapper.service.BranchOfficeMapper;

/**
 * @author erhernandez
 */
@Component(immediate = true, service = EngineApi.class)
public class EngineImpl implements EngineApi {

	private ReadRecordApi readRecordApi;

	private BranchOfficeMapper branchOfficeMapper;

	public EngineImpl() {
		this.branchOfficeMapper = new BranchOfficeMapper();
	}

	@Override
	public List<BranchOfficeDataDTO> getBranchOffice() {

		return branchOfficeMapper.toBranchOffice(readRecordApi.readBranchOffice());
	}

	@Reference
	public void setReadRecordApi(ReadRecordApi readRecordApi) {
		this.readRecordApi = readRecordApi;
	}
}