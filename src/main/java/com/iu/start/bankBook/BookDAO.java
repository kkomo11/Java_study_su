package com.iu.start.bankBook;

import java.util.List;

public interface BookDAO {
	
	public int setDelete(BankBookDTO bankBookDTO)throws Exception;
	
	public int setUpdate(BankBookDTO bankBookDTO)throws Exception;
	
	public int setBankBook(BankBookDTO bankBookDTO)throws Exception;
	
	public List<BankBookDTO> getList()throws Exception;
	
	public BankBookDTO getDetail(BankBookDTO bankBookDTO)throws Exception;
	
}
