package com.matheusyt.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusyt.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
