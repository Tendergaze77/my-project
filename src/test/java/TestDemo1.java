import configMy.Config;
import dao.StuDaoImpl;
import entity.Stu;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;
import service.StuService;

public class TestDemo1 {
    private AnnotationConfigApplicationContext appCon;
    @Before
    public void getappCon() {
        appCon = new AnnotationConfigApplicationContext(Config.class);//在Test执行之前创建appCon
    }
    @Test
    public void testStu(){
        AnnotationConfigApplicationContext appCon =
                new AnnotationConfigApplicationContext(Config.class);//IOC 容器初始化
        Stu stu1=   appCon.getBean(Stu.class);//向IOC容器索要一个对象
        stu1.eat();//执行操作
        Stu stu2=   appCon.getBean(Stu.class);//向IOC容器索要一个对象
        System.out.println(stu2);
        System.out.println(stu1==stu2);//判断两个地址是否相同，true  默认是单例模式 在IOC容器中只有一份
        //如果是 fasle 表示Spring容器每次获取prototype定义的Bean，容器都将创建一个新的Bean实例。原型模式

    }

    @Test
    public void testDao(){
        AnnotationConfigApplicationContext appCon =
                new AnnotationConfigApplicationContext(Config.class);//IOC 容器初始化
        StuDaoImpl stuDao=   appCon.getBean(StuDaoImpl.class);
        stuDao.selectStus();
    }

    @Test
    public void testService(){
//        AnnotationConfigApplicationContext appCon =
//                new AnnotationConfigApplicationContext(Config.class);//IOC 容器初始化
        StuService service=   appCon.getBean(StuService.class);
        Stu stu=   appCon.getBean(Stu.class);
        boolean result=service.register(stu);
        System.out.println(result);
    }
}
