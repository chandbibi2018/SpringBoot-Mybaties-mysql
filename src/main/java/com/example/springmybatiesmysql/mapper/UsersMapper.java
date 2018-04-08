package com.example.springmybatiesmysql.mapper;

import com.example.springmybatiesmysql.model.Users;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import java.util.List;

@Mapper
public interface UsersMapper {

    @Select("select * from users")
    List<Users> getAll();


    @Insert("insert into users(name,salary) values(#{name},#{salary})")
    @SelectKey(statement = "select Last_INSERT_ID()",keyProperty="id",
               before=false,resultType=Integer.class)
    void insert(Users users);
}
