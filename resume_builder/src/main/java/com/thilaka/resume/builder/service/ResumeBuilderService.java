package com.thilaka.resume.builder.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thilaka.resume.builder.entity.Skill;
import com.thilaka.resume.builder.repository.ResumeBuilderRepository;

@Service
public class ResumeBuilderService {
	
	@Autowired
	private ResumeBuilderRepository repository;
	
	public List<Skill> getAllSkills(){
		List<Skill> skills = new ArrayList<>();
		repository.findAll().forEach(skills::add);
		return skills;
		
	}

}
