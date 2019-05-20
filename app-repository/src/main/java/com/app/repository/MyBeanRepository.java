package com.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.repository.domain.MyBean;

@Repository
public interface MyBeanRepository extends JpaRepository<MyBean, Long> {
}
