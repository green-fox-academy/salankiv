package com.greenfox.salankiv.restcontroller.loghandler;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Log {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;

	LocalDateTime createdAt;
	String endpoint;
	String data;


}
