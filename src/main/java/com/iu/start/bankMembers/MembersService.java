package com.iu.start.bankMembers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MembersService {
	
	@Autowired
	private BankMembersDAO bankMembersDAO;
	
	int setJoin(BankMembersDTO bankMembersDTO) throws Exception {
		return bankMembersDAO.setJoin(bankMembersDTO);
	}
	
	BankMembersDTO getLogin(BankMembersDTO bankMembersDTO) throws Exception {
		return bankMembersDAO.getLogin(bankMembersDTO);
	}
	
	List<BankMembersDTO> getSearchByID(String search) throws Exception {
		return bankMembersDAO.getSearchByID(search);
	}
}
