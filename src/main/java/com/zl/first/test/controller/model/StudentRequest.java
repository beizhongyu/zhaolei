package com.zl.first.test.controller.model;

import lombok.Data;

@Data
public class StudentRequest {
    private String id;
    private String name;
    private String displayName;
    private String password;
    private String telPhone;
}
