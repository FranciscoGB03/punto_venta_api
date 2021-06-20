package com.mishos.repositories;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mishos.entities.Product;

public interface RepositoryProduct extends JpaRepository<Product, BigInteger>, RepositoryProductQuery{

}
