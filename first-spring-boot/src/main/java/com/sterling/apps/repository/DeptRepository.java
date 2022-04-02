package com.sterling.apps.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sterling.apps.model.Dept;

public interface DeptRepository extends JpaRepository<Dept,Long> {

}
