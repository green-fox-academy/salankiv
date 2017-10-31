package com.greenfox.todoembedded.repository;

import com.greenfox.todoembedded.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}
