//package com.sda.project.config;
//
//import com.sda.project.entities.UserEntity;
//import com.sda.project.repositories.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//// TODO load initial data using command line runner in spring boot
////@Configuration
//public class DbInit {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    @Bean
//    public CommandLineRunner loadData() {
//        return args -> {
//            createUser();
//        };
//    }
//
//    private void createUser() {
//        UserEntity user = new UserEntity();
//        user.setUsername("admin");
//        user.setPassword(passwordEncoder.encode("admin"));
//        userRepository.save(user);
//    }
//}
