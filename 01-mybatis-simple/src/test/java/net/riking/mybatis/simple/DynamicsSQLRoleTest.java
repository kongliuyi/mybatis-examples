package net.riking.mybatis.simple;

import net.riking.mybatis.simple.entity.Role;
import net.riking.mybatis.simple.mapper.RoleMapper;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 动态SQL案例
 * @Author kongLiuYi
 * @Date 2019/9/22 0022 15:17
 */
public class DynamicsSQLRoleTest extends  BaseMapperTest{

    @Test
    public  void selectRoleOneOrAllByName(){
        RoleMapper mapper = openSession.getMapper(RoleMapper.class);
         Role role=   new Role();
         role.setName("财务");//注释掉此行则查询全部
        mapper.selectRoleOneOrAllByName(role).stream().forEach(System.out::println);
    }

    @Test
    public  void selectRoleByNameOrDescOrCode(){
        RoleMapper mapper = openSession.getMapper(RoleMapper.class);
        Role role=   new Role();
        role.setName("财务");
       // role.setDescription("财务");
        role.setCode("IT");
        mapper.selectRoleByNameOrDescOrCode(role).stream().forEach(System.out::println);
    }


    @Test
    public  void selectRoleOneOrAllByName2(){
        RoleMapper mapper = openSession.getMapper(RoleMapper.class);
        Role role=   new Role();
        role.setName("财务");
        mapper.selectRoleOneOrAllByName2(role).stream().forEach(System.out::println);
    }

    @Test
    public  void updateRoleByNameAndCode() {
        RoleMapper mapper = openSession.getMapper(RoleMapper.class);
        Role role=   new Role();
        role.setId(103L);
        role.setName("IT2");
        role.setCode("IT2");
        System.out.println(mapper.updateRoleByNameAndCode(role));
        openSession.commit();
    }


    @Test
    public  void updateRoleByNameAndCode2() {
        RoleMapper mapper = openSession.getMapper(RoleMapper.class);
        Role role=   new Role();
        role.setId(103L);
        role.setName("IT2");
        role.setCode("IT2");
        System.out.println(mapper.updateRoleByNameAndCode2(role));
        openSession.commit();
    }


    @Test
    public  void selectRoleOneOrAllByNameOrCode() {
        RoleMapper mapper = openSession.getMapper(RoleMapper.class);
        Role role=   new Role();
        role.setName("IT2");
        role.setCode("IT2");
        mapper.selectRoleOneOrAllByNameOrCode(role).stream().forEach(System.out::println);
    }


    @Test
    public  void selectRoleByIds(){
        RoleMapper mapper = openSession.getMapper(RoleMapper.class);
        List<Long>  ids= new ArrayList<>();
        ids.add(101L);
        ids.add(102L);
        ids.add(103L);
        mapper.selectRoleByIds(ids).stream().forEach(System.out::println);
    }


    @Test
    public  void insertRoles(){
        RoleMapper mapper = openSession.getMapper(RoleMapper.class);
        List<Role>  roles= new ArrayList<>();
        Role role=   new Role();
        role.setName("IT3");
        role.setCode("IT3");
        roles.add(role);
        role=   new Role();
        role.setName("IT4");
        role.setCode("IT4");
        roles.add(role);
        System.out.println(mapper.insertRoles(roles));
        openSession.commit();
    }



}
