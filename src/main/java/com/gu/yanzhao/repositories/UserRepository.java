package com.gu.yanzhao.repositories;

import com.gu.yanzhao.models.Contact;
import com.gu.yanzhao.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    
    User findByUsername(String username);
}
