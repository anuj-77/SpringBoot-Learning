package com.assignmentTableMapping.tableMappingAssignment.services.impl;

import com.assignmentTableMapping.tableMappingAssignment.dto.CourseDTO;
import com.assignmentTableMapping.tableMappingAssignment.entity.CourseEntity;
import com.assignmentTableMapping.tableMappingAssignment.repository.CourseRepository;
import com.assignmentTableMapping.tableMappingAssignment.services.CourseService;
import com.assignmentTableMapping.tableMappingAssignment.util.CourseEntityToDTOMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private CourseEntityToDTOMapping courseEntityToDTOMapping;

    @Override
    public CourseDTO createCourse (CourseDTO courseDTO){
        CourseEntity entity = courseEntityToDTOMapping.map(courseDTO);
        courseRepository.save(entity);
        courseDTO.setId(entity.getId());
        return courseDTO;
    }

    @Override
    public List<CourseDTO> getAllCourse(){
        List<CourseEntity> courseEntities = courseRepository.findAll();
        List<CourseDTO> courseDTOs = new ArrayList<>();
        for (CourseEntity entity: courseEntities){
            courseDTOs.add(courseEntityToDTOMapping.map(entity));
        }
        return courseDTOs;
    }
}
