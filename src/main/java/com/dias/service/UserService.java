package com.dias.service;

import com.dias.entites.User;
import com.dias.infoDto.UsersConverter;
import com.dias.repositories.userRepositories;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@Service
public class UserService {

    final userRepositories userRepositories;
    final UsersConverter usersConverter;

    public UserService(com.dias.repositories.userRepositories userRepositories, UsersConverter usersConverter) {
        this.userRepositories = userRepositories;
        this.usersConverter = usersConverter;
    }


    public User list(){
        User n = new User();
        n.setUserName("admin");
        n.setPassword("admin123");
        n.setDurum(true);
        return n;
    }

    public User save(User user){
        return userRepositories.save(user);
    }
    public Map mapUserList(){
        Map<String, Object> map = new LinkedHashMap<>();
        User n = new User();
        n.setUserName("admin");
        n.setPassword("admin123");
        n.setDurum(true);
        n.setId(1);
        map.put("result",(n));
        map.put("status",true);
        return map;
    }
}
