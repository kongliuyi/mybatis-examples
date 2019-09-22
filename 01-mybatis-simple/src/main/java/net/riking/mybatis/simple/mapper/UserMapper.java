package net.riking.mybatis.simple.mapper;

import net.riking.mybatis.simple.entity.User;

import java.util.List;

public interface UserMapper {

	 User selectUserOne(Long id);

	 int insertUser(User user);

	 List<User> getAll();

	 void updateUserv(User user);

	 int deleteUserById(Long id);
}
