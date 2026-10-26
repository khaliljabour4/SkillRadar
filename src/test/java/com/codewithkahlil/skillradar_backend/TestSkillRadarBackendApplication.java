package com.codewithkahlil.skillradar_backend;

import org.springframework.boot.SpringApplication;

public class TestSkillRadarBackendApplication {

    public static void main(String[] args) {
        SpringApplication.from(SkillRadarBackendApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
