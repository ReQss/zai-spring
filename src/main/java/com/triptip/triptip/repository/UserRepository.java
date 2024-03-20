package com.triptip.triptip.repository;

import com.triptip.triptip.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByLogin(String name);
}
