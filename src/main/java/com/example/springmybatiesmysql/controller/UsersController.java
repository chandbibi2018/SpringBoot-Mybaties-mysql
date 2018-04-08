package com.example.springmybatiesmysql.controller;

import com.example.springmybatiesmysql.mapper.UsersMapper;
import com.example.springmybatiesmysql.model.Users;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/rest/users")
public class UsersController {

    private UsersMapper usersMapper;

    public void setUsersMapper(UsersMapper usersMapper) {

        this.usersMapper = usersMapper;
    }

    @GetMapping("/all")
    public List<Users> getAll(){
        return usersMapper.getAll();
    }

    @GetMapping("/update")
    public List<Users> insert(){
        Users users = new Users();
        users.setName("pqrs");
        users.setSalary(2000l);

        usersMapper.insert(users);
        return usersMapper.getAll();
    }


}
