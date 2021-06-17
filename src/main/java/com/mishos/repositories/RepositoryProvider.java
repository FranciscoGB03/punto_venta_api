package com.mishos.repositories;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mishos.entities.Provider;

public interface RepositoryProvider extends JpaRepository<Provider, BigInteger>, RepositoryProviderQuery {
		
}
