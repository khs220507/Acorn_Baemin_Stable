package com.acorn.baemin.seller.repository;

import java.util.List;

import com.acorn.baemin.domain.AnswerDTO;
import com.acorn.baemin.domain.ReviewDTO;
import com.acorn.baemin.domain.SellerDTO;
import com.acorn.baemin.domain.StoreDTO;



public interface SellerRepositoryI {
	
	// 以��깭
	public List<StoreDTO> sellerStore(String sellerCode); 
    	
    
    public void insertStore (StoreDTO store);
    
	
	// �깭誘�
	// 留ㅼ옣�젙蹂댄꺆
	// 留ㅼ옣�젙蹂� �씪遺�議고쉶1(留ㅼ옣�씠由�, �룊�젏, 由щ럭�닔, 理쒖냼二쇰Ц湲덉븸)
	public StoreDTO selectStoreSubInfo1(int storeCode);
	// 留ㅼ옣�젙蹂� �씪遺�議고쉶2(媛�寃뚯냼媛�, �슫�쁺�떆媛�, 留ㅼ옣二쇱냼)
	public StoreDTO selectSellerSubInfo2(int storeCode);
	// �궗�옣�떂�젙蹂� �씪遺�議고쉶(�씠由�, �궗�뾽�옄�벑濡앸쾲�샇)
	public SellerDTO selectSellerSubInfo(int sellerCode);
	// 留ㅼ옣�젙蹂� �씪遺��닔�젙(媛�寃뚯냼媛�, �슫�쁺�떆媛�, 留ㅼ옣二쇱냼)
	public int updateStoreSubInfo(StoreDTO store);
	// �궗�옣�떂�젙蹂� �씪遺��닔�젙(�씠由�, �궗�뾽�옄�벑濡앸쾲�샇)
	public int updateSellerSubInfo(SellerDTO seller);
	// 由щ럭�꺆
	// 由щ럭 �쟾泥� 議고쉶
	public List<ReviewDTO> selectAllReview();
	// �떟蹂� �벑濡�
	public int insertAnswer(String AnswerContent);
	// �떟蹂� �닔�젙
	public int updateAnswer(String AnswerContent);
	// �떟蹂� �궘�젣
	public int deleteAnswer(int AnswerCode);
	
}
