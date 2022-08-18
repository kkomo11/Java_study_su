package com.iu.start.bankMembers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/bankMembers/*")
public class MembersController {

	@Autowired
	private MembersService membersService;
	
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public void getLogin() throws Exception {
		
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String getLogin(BankMembersDTO bankMembersDTO, HttpSession session) throws Exception {
		bankMembersDTO = membersService.getLogin(bankMembersDTO);
		session.setAttribute("member", bankMembersDTO);
		
		return "redirect:../";
	}
	
	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.invalidate();
		
		return "redirect:../";
	}
	
	@RequestMapping(value = "search", method = RequestMethod.GET)
	public void getSearchByID() {
		
	}
	
	@RequestMapping(value = "search", method = RequestMethod.POST)
	public String getSearchByID(String search, Model model) throws Exception {
		List<BankMembersDTO> list = membersService.getSearchByID(search);
		model.addAttribute("list", list);
		
		return "bankMembers/list";
	}
}