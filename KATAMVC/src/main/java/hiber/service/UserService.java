package hiber.service;

import hiber.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    User getById(int id);

    void delete(int id);

    void edit( User user);

    public List<User> getAllUsers();
}
