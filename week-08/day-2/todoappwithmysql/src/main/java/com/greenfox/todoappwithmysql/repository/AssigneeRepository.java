package com.greenfox.todoappwithmysql.repository;

import com.greenfox.todoappwithmysql.model.Assignee;
import org.springframework.data.repository.CrudRepository;

public interface AssigneeRepository extends CrudRepository<Assignee, Long> {
}
