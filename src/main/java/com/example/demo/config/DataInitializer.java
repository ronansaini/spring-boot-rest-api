package com.example.demo.config;

import com.example.demo.domain.UserAccount;
import com.example.demo.domain.UserRole;
import com.example.demo.repository.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import java.util.Set;

@Component
public class DataInitializer implements CommandLineRunner {
    private final UserAccountRepository userAccountRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public DataInitializer(UserAccountRepository userAccountRepository, PasswordEncoder passwordEncoder) {
        this.userAccountRepository = userAccountRepository;
        this.passwordEncoder = passwordEncoder;
    }
    @Override
    public void run(String... args) throws Exception {
        if (userAccountRepository.count() == 0) {
            UserAccount standardUser = new UserAccount();
            standardUser.setUsername("user_customer");
            standardUser.setPassword(passwordEncoder.encode("password123")); 
            standardUser.setRoles(Set.of(UserRole.ROLE_USER));
            userAccountRepository.save(standardUser);

            UserAccount adminUser = new UserAccount();
            adminUser.setUsername("admin_manager");
            adminUser.setPassword(passwordEncoder.encode("adminSecurePass"));
            adminUser.setRoles(Set.of(UserRole.ROLE_USER, UserRole.ROLE_ADMIN));
            userAccountRepository.save(adminUser);
        }
    }
}