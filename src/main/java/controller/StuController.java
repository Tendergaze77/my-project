package controller;
import entity.Stu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import service.StuService;

@Controller
public class StuController {
    @Autowired
    private StuService stuService;

    public int login(){
        AnnotationConfigApplicationContext appCon = new AnnotationConfigApplicationContext();
        Stu stu=appCon.getBean(Stu.class);
        boolean result=stuService.register(stu);
        if(result){
            System.out.println("unsuccessfully login");
            return 1;
        }
        else{
            System.out.println("successfully login");
            return 0;
        }
    }
}
