package com.hao.service;

import com.hao.domain.Account;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Describe com.hao.service
 * @Auther wenhao chen
 * @CreateDate 2019/8/26
 * @Version 1.0
 */

public interface AccountService {

    public List<Account> findAllAccount();

    public void saveAcconut(Account account);
}
