package com.MultiDB.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MultiDB.model.user.User;

@Repository
public interface UserRepo extends JpaRepository<User , Integer> {

}
