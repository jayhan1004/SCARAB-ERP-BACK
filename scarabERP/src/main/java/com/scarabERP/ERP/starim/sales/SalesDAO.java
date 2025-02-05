package com.scarabERP.ERP.starim.sales;

import java.util.List;

import com.scarabERP.ERP.common.QueryVO;

public interface SalesDAO {
	//판매 아이디 들고오기
	public String getSaleID();
	
	//판매 등록하기
	public void insert(SalesVO vo);
	
	//토탈구하는거
	public int total(QueryVO vo);
	
	//판매 리스트
	public List<SalesInfoVO> list(QueryVO vo);
	
	//판매 삭제하기
	public void delete(String sales_id);
	
	//판매 수정하기
	public void update(SalesVO vo);
}
