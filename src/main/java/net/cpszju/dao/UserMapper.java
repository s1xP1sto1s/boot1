package net.cpszju.dao;

import java.util.HashMap;
import java.util.List;

import net.cpszju.domain.User;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
	
	List<User> selectUser(int age);
	
	void insertUser(@Param("name") String name,@Param("age") int age);
	
	void insertManyUser(List<User> list);
	
	void updateUser(@Param("name") String name,@Param("age") int age);
}
