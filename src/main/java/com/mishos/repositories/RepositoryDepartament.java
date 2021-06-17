package com.mishos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mishos.entities.Department;

public interface RepositoryDepartament extends JpaRepository<Department, Integer>, RepositoryDepartmentQuery {

}
