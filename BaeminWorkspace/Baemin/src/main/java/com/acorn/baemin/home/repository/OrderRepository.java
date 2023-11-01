package com.acorn.baemin.home.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.acorn.baemin.domain.OrderDTO;

@Repository
public class OrderRepository implements InterOrderRepository{

	@Autowired
	private SqlSession session;
	
	private static String namespace = "com.acorn.HomeMapper.";
	
	@Override
	public List<OrderDTO> orderSelectAll(int userCode) throws Exception {
    	System.out.println("orderList show");
        return session.selectList(namespace+"orderSelectAll",userCode);
    }
	
	
}
