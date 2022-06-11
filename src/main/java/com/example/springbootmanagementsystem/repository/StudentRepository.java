package com.example.springbootmanagementsystem.repository;

import com.example.springbootmanagementsystem.entiry.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Long>{

}