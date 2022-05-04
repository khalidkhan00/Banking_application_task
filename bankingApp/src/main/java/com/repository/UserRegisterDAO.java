package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.UserRegister;
@Repository
public interface UserRegisterDAO extends JpaRepository<UserRegister, String> {

	boolean exists(String email);

}
