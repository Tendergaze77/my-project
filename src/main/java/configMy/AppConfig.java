package configMy;
import controller.AccountController;
import dao.AccountDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import service.AccountService;

@Configuration
@ComponentScan(basePackages = {"entity","dao","controller","service","aspectJ"})
public class AppConfig {
    @Bean
    public AccountDao accountDao() {
        return new AccountDao();
    }
    @Bean
    public AccountService accountService() {
        return new AccountService();
    }
    @Bean
    public AccountController accountController() {
        return new AccountController();
    }
}
