package com.greenfox.salankiv.restcontroller.loghandler;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface LogRepository extends CrudRepository<Log, Long> {

	@Query(value = "SELECT id, data, endpoint FROM log", nativeQuery = true)
	List<Object> displayColumns();
}
