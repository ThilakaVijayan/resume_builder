package com.thilaka.resume.builder.repository;
import org.springframework.data.repository.CrudRepository;

import com.thilaka.resume.builder.entity.Skill;

public interface ResumeBuilderRepository extends CrudRepository<Skill,String> {

}
