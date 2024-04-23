package org.example.ccypsbackend.user.dao.repo;

import org.example.ccypsbackend.user.dao.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUname(String uname);
    User findByUnameAndPassword(String uname, String password);
}

