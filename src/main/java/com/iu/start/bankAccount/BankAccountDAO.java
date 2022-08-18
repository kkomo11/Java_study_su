package com.iu.start.bankAccount;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BankAccountDAO implements AccountDAO{

	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.iu.start.bankAccount.BankAccountDAO.";
	
	@Override
	public int setAccount(BankAccountDTO bankAccountDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.insert(NAMESPACE+"setAccount", bankAccountDTO);
	}
}