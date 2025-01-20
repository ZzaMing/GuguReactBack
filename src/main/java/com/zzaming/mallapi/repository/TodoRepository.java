package com.zzaming.mallapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zzaming.mallapi.domain.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
