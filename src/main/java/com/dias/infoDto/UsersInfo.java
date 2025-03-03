package com.dias.infoDto;

import lombok.Data;

@Data
public class UsersInfo {
    private int id;
    private String userName;
    private String password;
    private boolean durum;

    public UsersInfo(int id, String userName, String password, boolean durum) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.durum = durum;
    }
}
