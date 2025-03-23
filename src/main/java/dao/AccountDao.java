package dao;
import entity.Account;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDao implements AccountDaoInterface{
    public AccountDao(){
        System.out.println("AccountDao constructor!!!");
    }
    @Override
    public void saveAccount(Account account) {
        System.out.println("AccountDao: 保存账户信息如下：");
        System.out.println(account);
    }
}