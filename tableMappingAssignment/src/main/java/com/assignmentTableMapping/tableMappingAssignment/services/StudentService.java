package com.assignmentTableMapping.tableMappingAssignment.services;

import com.assignmentTableMapping.tableMappingAssignment.dto.StudentDTO;

import java.util.List;

public interface StudentService {
    StudentDTO createStudent(StudentDTO student);

    List<StudentDTO> getAllStudents();

    StudentDTO getStudentByID(Long id);
}
