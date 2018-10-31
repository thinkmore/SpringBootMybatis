package com.tuling.cloud.study.repository;

import com.tuling.cloud.study.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ryan on 2018/10/30.
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
