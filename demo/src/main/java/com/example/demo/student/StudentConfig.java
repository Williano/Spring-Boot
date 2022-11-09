package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
        Student mariam = new Student(1L, "Mariam",LocalDate.of(2000, Month.APRIL, 5), "mariam@gmail.com");
        Student alex = new Student("Alex",  LocalDate.of(2002, Month.APRIL, 21), "alex@gmail.com");

        repository.saveAll(List.of(mariam, alex));
        };
    }
}
