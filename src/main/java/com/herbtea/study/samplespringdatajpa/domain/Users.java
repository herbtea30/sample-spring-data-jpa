package com.herbtea.study.samplespringdatajpa.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "testuser")
public class Users {

    @Id
    private String id;
    private String name;
    private Long age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
