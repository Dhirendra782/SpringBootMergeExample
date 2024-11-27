package com.springbootcodemegeexample.repository;

import com.springbootcodemegeexample.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
