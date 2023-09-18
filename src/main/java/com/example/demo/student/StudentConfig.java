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
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return  args -> {
                Student chanuka = new Student(
                        "Chanuka",
                        "chanuka@gmail.com",
                        LocalDate.of(2001, Month.JANUARY,31)
                );
            Student lakshan = new Student(
                    "Lakshan",
                    "lakshan@gmail.com",
                    LocalDate.of(2000, Month.JANUARY,15)
            );

            repository.saveAll(
                    List.of(chanuka, lakshan)
            );


        };
    }
}
