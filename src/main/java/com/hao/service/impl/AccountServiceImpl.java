package com.hao.service.impl;

import com.hao.dao.AccountDao;
import com.hao.domain.Account;
import com.hao.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Describe com.hao.service.impl
 * @Auther wenhao chen
 * @CreateDate 2019/8/26
 * @Version 1.0
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAllAccount() {
        System.out.println("service查询所有账户--");
        return accountDao.findAllAccount();
    }

    @Override
    public void saveAcconut(Account account) {
        System.out.println("service保存账户--");
        accountDao.saveAcconut(account);
    }
}
