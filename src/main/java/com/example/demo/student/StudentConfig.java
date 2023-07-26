package com.example.demo.student;

import com.example.demo.Student;
import org.springframework.beans.factory.annotation.Configurable;
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
        return args -> {
            Student sahan = new Student(
                    "Sahan",
                    "sahantm0@gmail.com",
                    LocalDate.of(1998, Month.DECEMBER, 30)
            );

            Student nuwan = new Student(
                    "Nuwan",
                    "nuwan0@gmail.com",
                    LocalDate.of(1996, Month.JANUARY, 3)
            );

            repository.saveAll(
                    List.of(sahan, nuwan)
            );

        };
    }
}
