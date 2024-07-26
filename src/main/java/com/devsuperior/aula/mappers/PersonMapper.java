package com.devsuperior.aula.mappers;

import com.devsuperior.aula.dto.PersonDepartmentDTO;
import com.devsuperior.aula.entities.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    @Mapping(target = "department", source = "department")
    PersonDepartmentDTO toDto(Person entity);

    @Mapping(target = "department", source = "department")
    Person toEntity(PersonDepartmentDTO dto);
}