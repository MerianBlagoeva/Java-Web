package com.meri.service;

import com.meri.model.User;

import java.util.Optional;

public interface UserService {
    Optional<User> findYoungestUser();
}
