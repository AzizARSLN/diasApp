package com.dias.repositories;

import com.dias.entites.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepositories extends JpaRepository<User, Integer> {

    @Override
    <S extends User> S save(S entity);

    @Override
    User getOne(Integer integer);

    @Override
    <S extends User> S saveAndFlush(S entity);


}
