package com.greenfox.todoappwithmysql.repository;

import com.greenfox.todoappwithmysql.model.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Long> {

	List<Todo> findAllByDoneFalse();

	List<Todo> findByTitle(String title);
}
