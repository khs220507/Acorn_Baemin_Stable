package com.acorn.baemin.home.repository;

import java.util.List;

import com.acorn.baemin.domain.OrderDTO;



public interface InterOrderRepository {

	public List<OrderDTO> orderSelectAll(int userCode) throws Exception;
	
	
}
