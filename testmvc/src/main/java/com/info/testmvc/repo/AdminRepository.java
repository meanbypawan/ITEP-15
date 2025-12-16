package com.info.testmvc.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.info.testmvc.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>{
   Optional<Admin> findByEmailAndPassword(String email,String password);
}
