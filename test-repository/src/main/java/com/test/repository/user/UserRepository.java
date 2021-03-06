package com.test.repository.user;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.model.entities.user.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
