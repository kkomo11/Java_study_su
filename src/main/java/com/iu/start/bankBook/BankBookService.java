package com.iu.start.bankBook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankBookService {

	@Autowired
	BankBookDAO bankBookDAO;

	List<BankBookDTO> getList() throws Exception {
		return bankBookDAO.getList();
	}

	int setBankBook(BankBookDTO bankBookDTO) throws Exception {
		return bankBookDAO.setBankBook(bankBookDTO);
	}

	BankBookDTO getDetail(BankBookDTO bankBookDTO) throws Exception {
		return bankBookDAO.getDetail(bankBookDTO);
	}

	int setDelete(BankBookDTO bankBookDTO) throws Exception {
		return bankBookDAO.setDelete(bankBookDTO);
	}

	int setUpdate(BankBookDTO bankBookDTO)throws Exception {
		return bankBookDAO.setUpdate(bankBookDTO);
	}

}
