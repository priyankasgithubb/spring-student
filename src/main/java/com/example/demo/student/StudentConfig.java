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
    CommandLineRunner commandLineRunner(
            StudentRepository repository
    ){
        return args -> {
            Student kat = new Student(
                    "kat",
                    "kat@gmail.com",
                    LocalDate.of(2005, Month.JULY, 24)
            );

            Student sky = new Student(
                    "sky",
                    "sky@gmail.com",
                    LocalDate.of(2004, Month.NOVEMBER, 10)
            );

            repository.saveAll(
                    List.of(kat, sky)
            );

        };
    }
}

