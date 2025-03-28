package com.assignmentTableMapping.tableMappingAssignment.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Assignment_Table")
public class AssignmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Assignment_Name")
    private String name;

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
