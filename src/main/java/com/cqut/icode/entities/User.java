package com.cqut.icode.entities;

import com.cqut.icode.annotation.FieldType;
import com.cqut.icode.annotation.AutoIncrementId;
import com.cqut.icode.annotation.Entity;
import com.cqut.icode.entities.base.BaseEntity;

/**
 * @author 谭强
 * @date 2019/5/12
 */
@Entity(value = "user")
public class User extends BaseEntity {
    @AutoIncrementId
    @FieldType(value = "Long")
    private Long id;
    @FieldType(value = "Long")
    private Long username;
    @FieldType(value = "String")
    private String password;

    public User() {
    }

    public User(Long username, String password) {
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getUsername() {
        return username;
    }

    public void setUsername(Long username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username=" + username +
                ", password='" + password + '\'' +
                '}';
    }
}
