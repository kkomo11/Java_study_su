package com.iu.start.bankMembers;

import java.util.List;

public interface MembersDAO {

	int setJoin(BankMembersDTO bankMembersDTO) throws Exception;
	
	BankMembersDTO getLogin(BankMembersDTO bankMembersDTO) throws Exception;
	
	List<BankMembersDTO> getSearchByID(String search) throws Exception; 
}