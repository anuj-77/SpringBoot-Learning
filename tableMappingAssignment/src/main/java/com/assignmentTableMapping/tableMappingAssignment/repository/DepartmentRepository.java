package com.assignmentTableMapping.tableMappingAssignment.repository;

import com.assignmentTableMapping.tableMappingAssignment.entity.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<DepartmentEntity,Long> {
}
