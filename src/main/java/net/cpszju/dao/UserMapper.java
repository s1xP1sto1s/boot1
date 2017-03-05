package net.cpszju.dao;

import java.util.HashMap;
import java.util.List;

import net.cpszju.domain.User;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
	
	List<User> selectUser(int age);
	
	void insertUser(String name,int age);
	
	void insertManyUser(List<User> list);
	
	void updateUser(String name,int age);
}
