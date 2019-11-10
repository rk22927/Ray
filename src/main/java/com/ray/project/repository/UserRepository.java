package com.ray.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ray.project.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
