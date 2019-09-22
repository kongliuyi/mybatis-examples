package net.riking.mybatis.simple;

import net.riking.mybatis.simple.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

/**
 * @Description 基础操作CRUD
 * @Author kongLiuYi
 * @Date 2019/9/21 0021 19:56
 */
public class BasicOperationUserTest extends  BaseMapperTest{



    @Test
    public  void   selectUserOne(){
        // 查询
        String sql = "net.riking.mybatis.simple.mapper.UserMapper.selectUserOne";
        // 调用api查询
        User user = openSession.selectOne(sql, 101L);
        System.out.println(user.toString());
    }

    @Test
    public  void   insertUser(){
        // 插入
        String sql = "net.riking.mybatis.simple.mapper.UserMapper.insertUser";
        User user =new User();
        user.setUsername("Charles2");
        user.setPassword("123456");
        int insert = openSession.insert(sql, user);
        System.out.println(insert);
        openSession.commit(); //提交事物
    }


    @Test
    public  void   insertList(){
        // 插入
        String sql = "net.riking.mybatis.simple.mapper.UserMapper.insertUser";
/*        User user =new User();
        user.setUsername("Charles");
        user.setPassword("123456");
        openSession.in
        int insert = openSession.insert(sql, user);*/
       // System.out.println(insert);
        openSession.commit(); //提交事物
    }

    @Test
    public  void   selectList(){
        // 查询所有
        String sql = "net.riking.mybatis.simple.mapper.UserMapper.getAll";
        List<User> objects = openSession.selectList(sql);
        objects.stream().forEach(System.out::println);
    }


    @Test
    public  void   update(){
        //更新
        String sql = "net.riking.mybatis.simple.mapper.UserMapper.updateUserById";
        User user =new User();
        user.setId(103L);
        user.setUsername("Tina");
        user.setPassword("123456");
        int update = openSession.update(sql, user);
        System.out.println(update);
        openSession.commit(); //提交事物
    }

    @Test
    public  void   delete(){
        //删除
        String sql = "net.riking.mybatis.simple.mapper.UserMapper.deleteUserById";
        int delete = openSession.delete(sql, 103L);
        System.out.println(delete);
        openSession.commit(); //提交事物
    }



}
