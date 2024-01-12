package io.wferdinando.payment.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import io.wferdinando.payment.system.entity.User;


public interface UserRepository extends JpaRepository<User, Long> {
    
    UserDetails findByEmail(String email);    

}
