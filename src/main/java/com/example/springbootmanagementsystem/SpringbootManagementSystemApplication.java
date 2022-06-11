package com.example.springbootmanagementsystem;

import com.example.springbootmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootManagementSystemApplication.class, args);
    }


    @Autowired
    private StudentRepository studentRepository;


    public void run(String... args) throws Exception {

        /*
         * Student student1 = new Student("Ramesh", "Fadatare", "ramesh@gmail.com");
         * studentRepository.save(student1);
         *
         * Student student2 = new Student("Sanjay", "Jadhav", "sanjay@gmail.com");
         * studentRepository.save(student2);
         *
         * Student student3 = new Student("tony", "stark", "tony@gmail.com");
         * studentRepository.save(student3);
         */

    }
}
