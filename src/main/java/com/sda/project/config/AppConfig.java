package com.sda.project.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("sda.project")
@EntityScan("sda.project.entities")
@EnableJpaRepositories("sda.project.repositories")
public class AppConfig {
}
