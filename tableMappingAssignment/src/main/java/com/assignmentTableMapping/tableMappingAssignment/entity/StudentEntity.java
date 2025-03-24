package com.assignmentTableMapping.tableMappingAssignment.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Student_Table")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Student_Name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "Department_id")
    private DepartmentEntity departmentEntity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AssignmentEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
