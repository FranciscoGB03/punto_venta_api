package com.mishos.repositories;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mishos.entities.Presentation;

public interface RepositoryPresentation  extends JpaRepository<Presentation, BigInteger>, RepositoryPresentationQuery {

}
