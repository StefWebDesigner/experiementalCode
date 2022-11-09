package com.coder.jdbcpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@SpringBootApplication
public class JdbcpracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdbcpracticeApplication.class, args);
	}




}
