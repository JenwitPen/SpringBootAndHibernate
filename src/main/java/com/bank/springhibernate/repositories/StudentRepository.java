package com.bank.springhibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.springhibernate.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}