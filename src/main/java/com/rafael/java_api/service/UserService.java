package com.rafael.java_api.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafael.java_api.model.UserModel;
import com.rafael.java_api.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void save(String name, Date birthday, short age) {
        this.userRepository.save(new UserModel(name, birthday, age));
    }

    public void save(String id, String name, Date birthday, short age) {
        this.userRepository.save(new UserModel(id, name, birthday, age));
    }

    public List<UserModel> findAll() {
        return (List<UserModel>) this.userRepository.findAll();
    }

    public List<UserModel> findByName(String name) {
        return (List<UserModel>) this.userRepository.findByName(name);
    }

    public List<UserModel> findByAgeAndName(short age, String name) {
        return (List<UserModel>) this.userRepository.findByAgeAndName(age, name);
    }

    public void delete(String id) {
        this.userRepository.deleteById(id);
    }

}
