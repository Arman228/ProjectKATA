package hiber.dao;

import hiber.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateOperations;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {


    @PersistenceContext
    private EntityManager entity;


    @Override
    public void add(User user) {
        entity.persist(user);

    }

    @Override
    public User getById(int id) {
        return entity.find(User.class, id);
    }

    @Override
    public void delete(int id) {
        User user = entity.find(User.class, id);
        entity.remove(user);

    }

    @Override
    public void edit( User user) {
        entity.merge(user);


    }

    @Override
    public List<User> getAllUsers() {
        return entity.createQuery("select u from  User u", User.class).getResultList();
    }


}


