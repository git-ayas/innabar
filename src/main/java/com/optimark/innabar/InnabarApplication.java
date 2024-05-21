package com.optimark.innabar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.optimark.innabar.repository")
@EntityScan(basePackages = "com.optimark.innabar.model")
public class InnabarApplication {

    public static void main(String[] args) {
        SpringApplication.run(InnabarApplication.class, args);
    }
}
