package service;

import dao.StuDao;
import dao.StuDaoImpl;
import entity.Stu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StuService {
    @Autowired
    private StuDaoImpl stuDao;
    public boolean register(Stu stu) {
        //日志记录
//        System.out.println("Hello Springboot！！！");
//        System.out.println("当前方法被调用！！！");

        int result=stuDao.register(stu);
        if(result>0){
            System.out.println("已经注册！！！");
            return false;
        }
        int result2=stuDao.saveStu(stu);
        return true;
    }
    public void login(){
        //日志记录
//        System.out.println("Hello Springboot！！！");
//        System.out.println("当前方法被调用！！！");
        //核心业务
        int result=stuDao.selectStus();
        if(result>0){
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }
    }
}
