package com.kingbom.springoauth.repository;

import com.kingbom.springoauth.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by bombay on 12/15/2017 AD.
 */
public interface UsersRepository extends JpaRepository<Users, Integer>{

    Optional<Users> findByName(String username);
}
