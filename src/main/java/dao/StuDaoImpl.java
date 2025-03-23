package dao;

import entity.Stu;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository//表示DAO数据访问层  StuDaoImpl对象，默认是一个对象，放在IOC容器
public class StuDaoImpl implements StuDao{
    public StuDaoImpl() {
        System.out.println("StuDaoImpl被实例化");
    }
    @Override
    public int saveStu(Stu stu) {
        System.out.println("添加stu数据，dao层");
        return 0;
    }
    @Override
    public int selectStus() {
        System.out.println("查询stu数据，dao层");
        return 0;
    }

    @Override
    public int register(Stu stu) {
        return 1;
    }
}
