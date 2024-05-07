package co.edu.unbosque.model.dao.impl;

import co.edu.unbosque.model.dao.UserDAO;
import co.edu.unbosque.model.datasource.DataSource;
import co.edu.unbosque.model.entities.User;

import java.util.List;

public class UserDAOImpl implements UserDAO {
    @Override
    public User create(User user) {
        return DataSource.createUser(user);
    }

    @Override
    public User update(User user) {
        return DataSource.updateUser(user);
    }

    @Override
    public User delete(User user) {
        return DataSource.removeUser(user);
    }

    @Override
    public User find(String id) {
        return DataSource.getUser(Integer.parseInt( id));
    }

    @Override
    public List<User> findAll() {
        return DataSource.getAllUsers();
    }
}
