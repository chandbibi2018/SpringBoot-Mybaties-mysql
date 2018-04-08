package com.example.springmybatiesmysql;

import com.example.springmybatiesmysql.model.Users;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes(Users.class)
@MapperScan("com.example.springmybatiesmysql.mapper")
@SpringBootApplication
public class SpringMybatiesMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMybatiesMysqlApplication.class, args);
	}
}
