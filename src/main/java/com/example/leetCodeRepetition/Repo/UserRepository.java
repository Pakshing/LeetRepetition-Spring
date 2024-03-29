package com.example.leetCodeRepetition.Repo;

import com.example.leetCodeRepetition.Model.Question;
import com.example.leetCodeRepetition.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer>{
    User findUserByEmail(String email);
}
