package com.devsuperior.aula.services;

import com.devsuperior.aula.dto.PersonDepartmentDTO;
import com.devsuperior.aula.entities.Department;
import com.devsuperior.aula.entities.Person;
import com.devsuperior.aula.mappers.DepartmentMapper;
import com.devsuperior.aula.mappers.PersonMapper;
import com.devsuperior.aula.repositories.DepartmentRepository;
import com.devsuperior.aula.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private PersonMapper personMapper;

    @Autowired
    private DepartmentMapper departmentMapper;

    public PersonDepartmentDTO insert(PersonDepartmentDTO dto){


        Person entity = personMapper.toEntity(dto);
        Department department = departmentRepository.getReferenceById(dto.getDepartment().getId());

        entity.setDepartment(department);
        entity = repository.save(entity);

        return personMapper.toDto(entity);
    }
}