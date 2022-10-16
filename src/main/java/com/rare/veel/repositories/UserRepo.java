package com.rare.veel.repositories;

import com.rare.veel.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository // SB knows its a repo to access DB
public interface UserRepo extends JpaRepository<User, String> {
    User findByUserId(String id);
    List<User> findByAge(String age);
    User findByUserIdAndName(String id, String name);
    // keep appending using Hibernate /jpa syntax for designing queries that you need. Keep sequence of variables same as the parameters passed to the function.
}
