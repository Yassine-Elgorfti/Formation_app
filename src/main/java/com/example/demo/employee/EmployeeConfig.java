package com.example.demo.employee;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.time.LocalDate;
import java.util.List;


@Configuration
public class EmployeeConfig {
    @Bean
    CommandLineRunner commandLineRunner(EmployeeRepository repository){
        return args -> {
            Employee employee= new Employee(
            "oussama",
            "Sebbar",
            "Oussama",
            LocalDate.of(1988, 1, 5),
            "m",
            "oussama.sebbar@gmail.com",
            "ingénieur",
            34,
            15
            );

            repository.saveAll(List.of(employee));
        };
    }
}
