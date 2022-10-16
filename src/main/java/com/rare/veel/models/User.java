package com.rare.veel.models;
// all variables declared in models should be private by convention make getters and setters public

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // Spring Boot knows this class is a table in the db.
@Table(name = "user", schema = "public")
public class User {
    @Id  // tells SB the variable is a primary key in the table /db
    @Column(name = "user_id") //this helps translate between db and model if names are not the same.
    private String userId;

    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private String age;
    @Column(name = "is_manger")
    private Boolean isManger;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Boolean getManger() {
        return isManger;
    }

    public void setManger(Boolean manger) {
        isManger = manger;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", isManger=" + isManger +
                '}';
    }
}
