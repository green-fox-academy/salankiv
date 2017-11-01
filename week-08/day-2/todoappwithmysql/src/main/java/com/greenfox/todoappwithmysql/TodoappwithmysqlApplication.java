package com.greenfox.todoappwithmysql;

import com.greenfox.todoappwithmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoappwithmysqlApplication {

	@Autowired
	TodoRepository todoRepository;

	public static void main(String[] args) {
		SpringApplication.run(TodoappwithmysqlApplication.class, args);
	}

}
