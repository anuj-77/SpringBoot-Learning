package com.assignmentTableMapping.tableMappingAssignment.repository;

import com.assignmentTableMapping.tableMappingAssignment.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {

}
