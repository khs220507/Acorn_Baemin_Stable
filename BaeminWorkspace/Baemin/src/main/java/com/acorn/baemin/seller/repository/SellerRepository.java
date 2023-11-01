package com.acorn.baemin.seller.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.acorn.baemin.domain.ReviewDTO;
import com.acorn.baemin.domain.SellerDTO;
import com.acorn.baemin.domain.StoreDTO;

@Repository
public class SellerRepository implements SellerRepositoryI {
	@Autowired
	private SqlSession session;

	private static String namespaceSeller = "com.acorn.SellerMapper.";
	private static String namespaceStore = "com.acorn.StoreMapper.";
	private static String namespaceReview = "com.acorn.ReviewMapper.";
	private static String nameAnswer = "com.acorn.AnswerMapper.";

	// 준태
	
	
	    public List<StoreDTO> sellerStore(String sellerCode) {
	    	return session.selectList(namespaceStore+"sellerStore",sellerCode);
	    }
	    
	    public void insertStore (StoreDTO store) {
	    	session.insert(namespaceStore+"insertStore", store);
	    }

	// 태민
	// 매장정보탭
	// 매장정보 일부조회1(매장이름, 매장평점, 리뷰수, 최소주문금액)
	@Override
	public StoreDTO selectStoreSubInfo1(int storeCode) {
		System.out.println("selectStoreSubInfo1");
		return session.selectOne(namespaceStore + "selectStoreSubInfo1", storeCode);
	}
	// 매장정보 일부조회2(가게소개, 운영시간, 매장주소)
	@Override
	public StoreDTO selectSellerSubInfo2(int storeCode) {
		System.out.println("selectStoreSubInfo2");
		return session.selectOne(namespaceStore + "selectStoreSubInfo2", storeCode);
	}
	// 사장님정보 일부조회(이름, 사업자등록번호)
	@Override
	public SellerDTO selectSellerSubInfo(int sellerCode) {
		System.out.println("selectSellerSubInfo");
		return session.selectOne(namespaceSeller + "selectSellerSubInfo", sellerCode);
	}
	// 매장정보 일부수정(가게소개, 운영시간, 매장주소)
	@Override
	public int updateStoreSubInfo(StoreDTO store) {
		System.out.println("updateStoreSubInfo");
		return session.selectOne(namespaceStore + "updateStoreSubInfo", store);
	}
	// 사장님정보 일부수정(이름, 사업자등록번호)
	@Override
	public int updateSellerSubInfo(SellerDTO seller) {
		System.out.println("updateSellerSubInfo");
		return session.update(namespaceSeller + "updateSellerSubInfo", seller);
	}
	// 리뷰 전체 조회
	@Override
	public List<ReviewDTO> selectAllReview() {
		System.out.println("selectAllReview");
		return session.selectList(namespaceReview + "selectAllReview");
	}
	// 답변 등록
	@Override
	public int insertAnswer(String AnswerContent) {
		System.out.println("insertAnswer");
		return session.insert(nameAnswer + "insertAnswer", AnswerContent);
	}
	// 답변 수정
	@Override
	public int updateAnswer(String AnswerContent) {
		System.out.println("updateAnswer");
		return session.update(nameAnswer + "updateAnswer", AnswerContent);
	}
	// 답변 삭제
	@Override
	public int deleteAnswer(int AnswerCode) {
		System.out.println("deleteAnswer");
		return session.delete(nameAnswer + "deleteAnswer", AnswerCode);
	}



}