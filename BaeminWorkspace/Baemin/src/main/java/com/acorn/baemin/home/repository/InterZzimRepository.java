package com.acorn.baemin.home.repository;

import java.util.List;

import com.acorn.baemin.domain.ZzimDTO;



public interface InterZzimRepository {

	public List<ZzimDTO> zzimSelectAll(int userCode) throws Exception;
	
	public int zzimDelete(int userCode, int storeCode) throws Exception;
}
