package dao;

import entity.Stu;

public interface StuDao {
    public int saveStu(Stu stu);//模拟，表示对数据库进行添加学生数据
    public int selectStus();//表示对数据库查询所有学生
    public int register(Stu stu);
}
