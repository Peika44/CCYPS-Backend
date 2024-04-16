package org.example.ccypsbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class CcypsBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(CcypsBackendApplication.class, args);
    }

}
