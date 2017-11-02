package com.greenfox.todoappwithmysql.controller;

import com.greenfox.todoappwithmysql.model.Todo;
import com.greenfox.todoappwithmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

	@Autowired
	TodoRepository todoRepository;

	@RequestMapping(value = {"", "/", "/list"})
	public String list(Model model, @RequestParam(value = "isActive", required = false) String isActive, @RequestParam(value = "title", required = false) String title) {
		if (title != null) {
			model.addAttribute("todos", todoRepository.findByTitle(title));
		} else if (isActive != null && isActive.equals("true")) {
			model.addAttribute("todos", todoRepository.findAllByDoneFalse());
		} else {
			model.addAttribute("todos", todoRepository.findAll());
		}
		return "todoslist";
	}

	@RequestMapping(value = "/create")
	public String loadCreate() {
		return "create";
	}

	@GetMapping(value = "/create/new")
	public String createTodo(@RequestParam String title) {
		todoRepository.save(new Todo(title));
		return "redirect:/todo/list";
	}

	@GetMapping(value = "/{id}/delete")
	public String deleteTodo(@PathVariable String id) {
		todoRepository.delete(Long.parseLong(id));
		return "redirect:/todo/list";
	}

	@GetMapping(value = "/{id}/edit")
	public String loadTodo(@PathVariable Long id, Model model) {
		model.addAttribute("todo", todoRepository.findOne(id));
		return "edit";
	}

	@PostMapping(value = "/{id}/edit")
	public String editTodo(@PathVariable Long id, @ModelAttribute Todo todo) {
		todoRepository.save(todo);
		return "redirect:/todo/list";
	}
}
