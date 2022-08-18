package com.iu.start.bankAccount;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.iu.start.bankAccount.BankAccountDTO;
import com.iu.start.bankAccount.BankAccountService;
import com.iu.start.bankMembers.BankMembersDTO;
@Controller
@RequestMapping(value="/bankAccount/*")
public class BankAccountController {
	
	@Autowired
	BankAccountService bankAccountService;
	
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public String setAccount(HttpSession session) throws Exception {
		
		bankAccountService.setAccount((BankAccountDTO) session.getAttribute("bankmembers"));
		return "redirect:../bankbook/list";
	}
}

	

