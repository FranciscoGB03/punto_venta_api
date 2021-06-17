package com.mishos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mishos.entities.Subdepartment;

public interface RepositorySubdepartment extends JpaRepository<Subdepartment, Integer>, RepositorySubdepartmentQuery {

}
