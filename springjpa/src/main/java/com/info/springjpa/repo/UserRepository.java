package com.info.springjpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.info.springjpa.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
