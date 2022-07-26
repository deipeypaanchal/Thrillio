package com.thrillio.dao;

import com.thrillio.DataStore;
import com.thrillio.entities.User;

public class UserDao {
    public User[] getUsers() {
        return DataStore.getUsers();
    }
}