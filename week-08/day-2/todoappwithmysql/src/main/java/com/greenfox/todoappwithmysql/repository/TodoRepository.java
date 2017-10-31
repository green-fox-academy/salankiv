package com.greenfox.todoappwithmysql.repository;

import com.greenfox.todoappwithmysql.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}
