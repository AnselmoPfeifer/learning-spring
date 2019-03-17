package com.anselmopfeifer.com.model;

import lombok.Data;

@Data
public class Users {
    private Integer id;
    private String username;
    private String name;
    private String email;
    private Profile description;
}
