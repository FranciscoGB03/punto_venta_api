package com.mishos.repositories;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mishos.entities.Tax;

public interface RepositoryTax  extends JpaRepository<Tax, BigInteger>, RepositoryTaxQuery {

}
