package com.eltonmessias.JwtAuth.repository;

import com.eltonmessias.JwtAuth.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
