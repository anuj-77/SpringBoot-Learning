package com.assignmentTableMapping.tableMappingAssignment.repository;

import com.assignmentTableMapping.tableMappingAssignment.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<CourseEntity, Long> {
}
