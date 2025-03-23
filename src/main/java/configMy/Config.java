package configMy;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration//表示是一个配置类
@ComponentScan(basePackages = {"entity","dao","controller","service","aspectJ"})
@EnableAspectJAutoProxy//开启Spring对AspectJ的支持
public class Config {
    public Config() {
        System.out.println("Config被创建");
    }
}
