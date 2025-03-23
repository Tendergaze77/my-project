import configMy.AppConfig;
import configMy.Config;
import controller.AccountController;
import entity.Account;
import entity.Stu;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

public class AccountTest {
    @Test
    public void TestAccount() {
        AnnotationConfigApplicationContext appCon =
                new AnnotationConfigApplicationContext(AppConfig.class);
        AccountController accountController  =   appCon.getBean(AccountController.class);
        Account account =appCon.getBean(Account.class);
        account.setId(1);
        account.setName("zhangsan");
        account.setMoney(20000f);
        accountController.saveAccount(account);
        Account account1 =appCon.getBean(Account.class);
        account1.setId(2);
        account1.setName("lisi");
        account1.setMoney(30000f);
        accountController.saveAccount(account1);
    }
}
