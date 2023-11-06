package com.rafael.java_api.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document("user")
public class UserModel {
    @Id
    @Getter
    @Setter
    private String id;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private Date birthday;
    @Getter
    @Setter
    private short age;

    public UserModel(String id, String name, Date birthday, short age) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.age = age;
    }

    public UserModel(String name, Date birthday, short age) {
        this.name = name;
        this.birthday = birthday;
        this.age = age;
    }

    public UserModel() {
    }
}
