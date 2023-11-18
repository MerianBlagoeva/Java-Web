package com.meri.repository;

import com.meri.model.User;

import java.util.List;

public interface UserRepository {
    List<User> findAll();
}
