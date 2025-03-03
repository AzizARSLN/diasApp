package com.dias.infoDto;


import com.dias.entites.User;
import org.springframework.stereotype.Component;

@Component
public class UsersConverter {

    public static UsersInfo convert(User user) {
        return new UsersInfo(user.getId(), user.getUserName(), user.getPassword(), user.isDurum());
    }

}
