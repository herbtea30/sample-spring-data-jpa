package com.herbtea.study.samplespringdatajpa.entity;
import com.herbtea.study.samplespringdatajpa.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, String> {
    Users findByName(String name);
    Users findByIdAndName(String id, String name);

}
