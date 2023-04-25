package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ModelStudentClass;

public interface studentrepo extends JpaRepository<ModelStudentClass,Integer>
{

}
