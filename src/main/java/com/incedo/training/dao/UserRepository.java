package com.incedo.training.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.incedo.training.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>
{

}
