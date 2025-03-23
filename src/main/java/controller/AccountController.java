package controller;
import entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import service.AccountService;

import javax.annotation.Resource;

@Controller
public class AccountController {
//    @Resource(name = "accountService")
    @Autowired
    private AccountService accountService;

    public AccountController() {
        System.out.println("AccountController实例化");
    }

    public void saveAccount(Account account) {
        accountService.saveAccount(account);
        System.out.println("saveAccount Controller 实现功能！！！");
    }
}
