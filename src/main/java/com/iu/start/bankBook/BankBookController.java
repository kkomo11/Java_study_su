package com.iu.start.bankBook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/bankBook/*")
public class BankBookController {

	@Autowired
	private BankBookService bankBookService;

	@RequestMapping(value="list",method = RequestMethod.GET)
	public void getList(Model model)throws Exception{
		List<BankBookDTO> list = bankBookService.getList();
	}

	@RequestMapping(value="add",method = RequestMethod.GET)
	public String setBankBook()throws Exception {
		return "bankbook/add";
	}

	@RequestMapping(value="add",method = RequestMethod.POST)
	public String setBankBook(BankBookDTO bankBookDTO)throws Exception{
		int result = bankBookService.setBankBook(bankBookDTO);
		return "redirect:list";
	}

	@RequestMapping(value="detail",method = RequestMethod.GET)
	public String Detail(BankBookDTO bankBookDTO, Model model)throws Exception{
		bankBookDTO = bankBookService.getDetail(bankBookDTO);
		model.addAttribute("detail",bankBookDTO);
		return "bankbook/detail";
	}

	@RequestMapping(value = "update", method = RequestMethod.GET)
	public void update(BankBookDTO bankBookDTO,Model model) throws Exception {
		ModelAndView mv = new ModelAndView();
		System.out.println(bankBookDTO.getBookNum());
		bankBookDTO = bankBookService.getDetail(bankBookDTO);
		model.addAttribute("dto",bankBookDTO);

	}

	@RequestMapping(value = "update", method = RequestMethod.POST)
	public ModelAndView update(BankBookDTO bankBookDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		System.out.println(bankBookDTO.getBookNum());
		System.out.println(bankBookDTO.getBookName());
		System.out.println(bankBookDTO.getBookRate());
		int result = bankBookService.setBankBook(bankBookDTO);
		mv.setViewName("redirect:./detail?bookNum="+bankBookDTO.getBookNum());
		return mv;

	}

	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public ModelAndView delete(BankBookDTO bankBookDTO,Model model) throws Exception {
		ModelAndView mv = new ModelAndView();
		int result = bankBookService.setDelete(bankBookDTO);
		mv.setViewName("redirect:./list");
		return mv;
	}

	@RequestMapping(value = "delete", method = RequestMethod.POST)
	public ModelAndView delete(BankBookDTO bankBookDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		System.out.println(bankBookDTO.getBookNum());
		System.out.println(bankBookDTO.getBookName());
		System.out.println(bankBookDTO.getBookRate());
		int result = bankBookService.setDelete(bankBookDTO);
		return mv;

	}

}
