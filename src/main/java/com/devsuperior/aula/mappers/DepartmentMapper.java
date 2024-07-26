package com.devsuperior.aula.mappers;

import com.devsuperior.aula.dto.DepartmentDTO;
import com.devsuperior.aula.entities.Department;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DepartmentMapper {
    DepartmentDTO toDto(Department entity);
    Department toEntity(DepartmentDTO dto);
}