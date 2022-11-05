package hiber.dao;

import hiber.model.User;

import java.util.List;

public interface UserDao {

    void add(User user);

    User getById(int id);

    void delete(int id);

    void edit( User user);

    public List<User> getAllUsers();


}



