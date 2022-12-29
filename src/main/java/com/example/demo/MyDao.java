package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.UUID;

public interface MyDao extends JpaRepository<MyEntity, UUID>, QuerydslPredicateExecutor<MyEntity> {}
