package com.hao.controller;

import com.hao.domain.Account;
import com.hao.service.AccountService;
import com.hao.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Describe com.hao.controller
 * @Auther wenhao chen
 * @CreateDate 2019/8/26
 * @Version 1.0
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountServiceImpl accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("Controller查询所有了呢");
        List<Account> list = accountService.findAllAccount();
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping("/saveAccount")
    public String saveAccount(Account account){
        System.out.println("Controller保存了呢");
        accountService.saveAcconut(account);
        return "success";
    }
}
