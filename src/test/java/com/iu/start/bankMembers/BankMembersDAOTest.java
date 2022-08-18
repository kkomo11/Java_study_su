package com.iu.start.bankMembers;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.start.MyAbstractTest;

public class BankMembersDAOTest extends MyAbstractTest {

	@Autowired
	private BankMembersDAO bankMembersDAO;
	private BankMembersDTO bankMembersDTO = new BankMembersDTO();

//	@Test
//	public void setJoin() throws Exception {
//		bankMembersDTO.setId("id20");
//		bankMembersDTO.setPw("pw19");
//		bankMembersDTO.setName("id19");
//		bankMembersDTO.setEmail("id19");
//		bankMembersDTO.setPhone("id19");
//		int result = bankMembersDAO.setJoin(bankMembersDTO);
//		assertEquals(1, result);
//	}
	
	@Test
	public void getLogin() throws Exception {
		bankMembersDTO.setId("id4");
		bankMembersDTO.setPw("pw4");
		bankMembersDTO = bankMembersDAO.getLogin(bankMembersDTO);
		assertNotNull(bankMembersDTO);
	}
	
//	@Test
//	public void getSearchById() throws Exception {
//		List<BankMembersDTO> list = bankMembersDAO.getSearchByID("adfadgafsd");
//		assertNotEquals(0, list.size());
//	}
}
