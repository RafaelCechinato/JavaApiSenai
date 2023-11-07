package com.rafael.java_api.dto;

import com.rafael.java_api.model.CompanyModel;
import com.rafael.java_api.model.UserModel;

import lombok.Data;
import java.util.List;

@Data
public class CompanyUserDTO {
    private UserModel user;
    private List<UserModel> userList;
    private CompanyModel company;
}
