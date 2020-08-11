package com.thilaka.resume.builder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thilaka.resume.builder.entity.Skill;
import com.thilaka.resume.builder.service.ResumeBuilderService;

@RestController
@RequestMapping("/")
public class ResumeBuilderController {

	@Autowired
	private ResumeBuilderService service;

	@RequestMapping("/")
	public List<Skill> getallSkills() {
		return service.getAllSkills();
	}

}
