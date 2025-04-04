package com.corhuila.backend_EasyPark.models.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "admin")
public class Admin {

    public Admin(){

    }

    public Admin (String email, String name, String password){
        super();
        this.email = email;
        this.name = name;
        this.password = password;
    }
    @Id
    private String email;

    private String name;

    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
