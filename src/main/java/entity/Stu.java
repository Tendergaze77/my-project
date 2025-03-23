package entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//@Scope("prototype")//SPring Bean的作用域演示 原型
//Spring容器每次获取prototype定义的Bean，容器都将创建一个新的Bean实例。
@Component//一个Java Bean 一个对象，代表这个Stu类交给Spring IOC容器
//lombok自动创建get，set，toString方法
public class Stu {
    private String name;
    private Integer age;
    public Stu() {
        System.out.println("stu 被创建");
    }
    public  void eat(){
        System.out.println("eat吃饭");
    }
    @Override
    public String toString() {
        return "Stu{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
