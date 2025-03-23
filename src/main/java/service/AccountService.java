package service;

import dao.AccountDao;
import entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class AccountService {
//    @Resource(name = "accountDao")
    @Autowired
    private AccountDao accountDao;

    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
        System.out.println("AccountService: 账户信息已保存");
    }
}