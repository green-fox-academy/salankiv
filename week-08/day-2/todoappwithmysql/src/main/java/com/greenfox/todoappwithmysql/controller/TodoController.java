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
			if (isActive) {
				if (!todo.isDone()) {
					todos.add(todo);
				}
			} else if (!isActive) {
				todos.add(todo);
			}
		}
		model.addAttribute("todos", todos);
		return "todoslist";
	}

	@GetMapping(value = "/create")
	public String loadCreate() {
		return "create";
	}

	@PostMapping(value = "/create")
	public String createTodo(@RequestParam String title) {
		todoRepository.save(new Todo(title));
		return "redirect:/todo/list";
	}

	@GetMapping(value = "/{id}/delete")
	public String deleteTodo(@PathVariable String id) {
		todoRepository.delete(Long.parseLong(id));
		return "redirect:/todo/list";
	}
}
