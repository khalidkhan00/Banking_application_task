package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.AppOwner;
@Repository
public interface AppOwnerDAO extends JpaRepository<AppOwner, Integer>{

}
