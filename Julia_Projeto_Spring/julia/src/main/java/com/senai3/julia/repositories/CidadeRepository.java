package com.senai3.julia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai3.julia.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
