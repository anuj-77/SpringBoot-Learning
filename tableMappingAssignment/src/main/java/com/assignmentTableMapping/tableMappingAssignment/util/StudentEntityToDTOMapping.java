package com.assignmentTableMapping.tableMappingAssignment.util;

import com.assignmentTableMapping.tableMappingAssignment.dto.StudentDTO;
import com.assignmentTableMapping.tableMappingAssignment.entity.StudentEntity;
import org.springframework.stereotype.Component;


@Component
public class StudentEntityToDTOMapping {

    public StudentDTO map (StudentEntity entity){
        StudentDTO dto = new StudentDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }


    public StudentEntity map(StudentDTO dto){

        StudentEntity entity = new StudentEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        return entity;
    }
}
