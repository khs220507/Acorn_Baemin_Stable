package com.acorn.baemin.home.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.acorn.baemin.domain.ZzimDTO;



@Repository
public class ZzimRepository implements InterZzimRepository{

	@Autowired
    private SqlSession session;
 	
    private static String namespace = "com.acorn.HomeMapper.";
    
    public List<ZzimDTO> zzimSelectAll(int userCode) throws Exception {
    	System.out.println("zzimList show");
        return session.selectList(namespace+"zzimSelectAll",userCode);
    }
    

    public int zzimDelete( int userCode, int storeCode) throws Exception {
    	
    	ZzimDTO zzimDTO = new ZzimDTO();
    	zzimDTO.setUserCode(userCode);
        zzimDTO.setStoreCode(storeCode);
        
        return session.delete(namespace+"zzimDelete", zzimDTO);
    } 
	
}
