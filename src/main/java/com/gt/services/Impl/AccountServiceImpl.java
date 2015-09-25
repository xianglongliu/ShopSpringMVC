package com.gt.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gt.dao.AccountMapper;
import com.gt.model.Account;
import com.gt.services.base.AccountServiceI;
@Service
public class AccountServiceImpl implements AccountServiceI {
	@Autowired
    private AccountMapper accountMapper;
	@Override
	public Account test() {
		// TODO Auto-generated method stub
        return accountMapper.selectByPrimaryKey(1);
	}

}