package com.example.crudspringboot.crudspringboot.service;

import com.example.crudspringboot.crudspringboot.model.User;
import com.example.crudspringboot.crudspringboot.dao.UserDao;
import java.util.List;

public interface UserService extends UserDao {
    List<User>getAllUsers ();
    void saveUser(User user);
    void removeUser(long id);
    void updateUser(User user);
    User getUserById(long id);
}
