package com.splitwizz.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.splitwizz.object.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
