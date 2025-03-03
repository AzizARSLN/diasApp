package com.dias.entites;

import jakarta.persistence.*;
import jdk.jfr.Name;
import lombok.Data;

@Entity
@Data
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int Id;

    @Column(length=15)
    @Name("user_name")
    private String userName;

    private String password;
    private boolean durum;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isDurum() {
        return durum;
    }

    public void setDurum(boolean durum) {
        this.durum = durum;
    }
}
