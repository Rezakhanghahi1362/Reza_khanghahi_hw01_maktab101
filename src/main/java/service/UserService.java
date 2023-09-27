package service;

import entity.User;
import repository.UserRepository;

import java.sql.SQLException;

public class UserService {

    private UserRepository userRepository = new UserRepository();


    public UserService() throws SQLException {
    }

    public int save(User user) throws SQLException {

        return userRepository.save(user);

    }


}
