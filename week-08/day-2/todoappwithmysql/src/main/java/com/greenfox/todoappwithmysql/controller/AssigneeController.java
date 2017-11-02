package com.greenfox.todoappwithmysql.controller;

import com.greenfox.todoappwithmysql.model.Assignee;
import com.greenfox.todoappwithmysql.repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/assignee")
public class AssigneeController {

	@Autowired
	AssigneeRepository assigneeRepository;

	@RequestMapping(value = {"", "/", "/list"})
	public String loadAssignee(Model model) {
		model.addAttribute("assignees", assigneeRepository.findAll());
		return "assigneelist";
	}

	@GetMapping(value = "/create/new")
	public String newAssignee(@RequestParam String name, @RequestParam String email) {
		assigneeRepository.save(new Assignee(name, email));
		return "redirect:/assignee/list";
	}

	@GetMapping(value = "/{id}/delete")
	public String deleteAssignee (@PathVariable String id) {
		assigneeRepository.delete(Long.parseLong(id));
		return "redirect:/assignee/list";
	}

	@GetMapping(value = "/{id}/edit")
	public String loadAssignee(@PathVariable Long id, Model model) {
		model.addAttribute("editAssignee", assigneeRepository.findOne(id));
		return "editassignee";
	}

	@PostMapping(value = "/{id}/edit")
	public String editAssignee(@ModelAttribute(value = "id") Assignee editAssignee) {
		assigneeRepository.save(editAssignee);
		return "redirect:/assignee/list";
	}
}
