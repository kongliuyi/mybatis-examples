package net.riking.mybatis.simple.mapper;

import net.riking.mybatis.simple.entity.Role;

import java.util.List;

/**
 * @Description
 * @Author kongLiuYi
 * @Date 2019/9/22 0022 15:41
 */
public interface RoleMapper {
   List<Role> selectRoleOneOrAllByName(Role role);

   List<Role> selectRoleByNameOrDescOrCode(Role role);

   List<Role> selectRoleOneOrAllByName2(Role role);

   int updateRoleByNameAndCode(Role role);

   int updateRoleByNameAndCode2(Role role);

   List<Role> selectRoleOneOrAllByNameOrCode(Role role);

   List<Role>   selectRoleByIds (List<Long> ids);

   int   insertRoles( List<Role> roles);
}
