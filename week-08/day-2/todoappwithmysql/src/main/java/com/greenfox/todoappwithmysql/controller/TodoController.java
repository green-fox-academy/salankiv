package com.greenfox.todoappwithmysql.controller;

import com.greenfox.todoappwithmysql.model.Todo;
import com.greenfox.todoappwithmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

	@Autowired
	TodoRepository todoRepository;

	@RequestMapping(value = {"/", "/list"})
	public String list(Model model, @RequestParam(value = "isActive", required = false) boolean isActive) {
		List<Todo> todos = new ArrayList<>();
		for (Todo todo : todoRepository.findAll()) {
			if (isActive == true) {
				if (todo.isDone() == false) {
					todos.add(todo);
				}
			} else if (isActive == false) {
				todos.add(todo);
			}
		}
		model.addAttribute("todos", todos);
		return "todoslist";
	}

	@GetMapping(value = "/create")
	public String getNewTodo(Model model, String title) {
		model.addAttribute("title", title);
		return "create";
	}

	@PostMapping(value = "/create")
	public String createTodo(@RequestParam String title) {
		Todo newTodo = new Todo(title);
		todoRepository.save(newTodo);
		return "redirect:/todo/list";
	}
}
