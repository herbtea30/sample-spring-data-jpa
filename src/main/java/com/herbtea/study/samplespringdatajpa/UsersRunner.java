package com.herbtea.study.samplespringdatajpa;

import com.herbtea.study.samplespringdatajpa.domain.Users;
import com.herbtea.study.samplespringdatajpa.entity.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UsersRunner implements ApplicationRunner {
    @Autowired
    UsersRepository usersRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("__herbtea____ run() START!!");

        //객체를 생성
        Users users = new Users();
        users.setId("herbtea");
        users.setName("dony");
        users.setAge(24l);
        //users.setAge(25l);

        //INSERT
        usersRepository.save(users);

        //SELECT Id
        Optional<Users> byId = usersRepository.findById("herbtea");
        //SELECT Name
        Users byName = usersRepository.findByName("dony");
        //SELECT Id and Name
        Users byIdAndName = usersRepository.findByIdAndName("herbtea", "dony");
        //로그출력
        System.out.println("__herbtea__byId: " + byId.toString());
        System.out.println("__herbtea__byName: " + byName.toString());
        System.out.println("__herbtea__byIdAndName: " + byIdAndName.toString());
    }
}
