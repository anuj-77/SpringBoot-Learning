package com.assignmentTableMapping.tableMappingAssignment.services.impl;

import com.assignmentTableMapping.tableMappingAssignment.dto.StudentDTO;
import com.assignmentTableMapping.tableMappingAssignment.entity.StudentEntity;
import com.assignmentTableMapping.tableMappingAssignment.repository.StudentRepository;
import com.assignmentTableMapping.tableMappingAssignment.services.StudentService;
import com.assignmentTableMapping.tableMappingAssignment.util.StudentEntityToDTOMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    StudentEntityToDTOMapping studentEntityToDTOMapping;

    @Override
    public StudentDTO createStudent(StudentDTO student) {
        StudentEntity entity = studentEntityToDTOMapping.map(student);
        studentRepository.save(entity);
        student.setId(entity.getId());
        return student;
    }

    @Override
    public List<StudentDTO> getAllStudents() {
        Iterable<StudentEntity> studentEntities = studentRepository.findAll();
        List<StudentDTO> studentDTOs = new ArrayList<>();
        for (StudentEntity entity : studentEntities) {
            studentDTOs.add(studentEntityToDTOMapping.map(entity));
        }
        return studentDTOs;
    }

    @Override
    public StudentDTO getStudentByID(Long id) {
        Optional<StudentEntity> optionalStudentEntity = studentRepository.findById(id);
        return studentEntityToDTOMapping.map(optionalStudentEntity.get());

    }


}
