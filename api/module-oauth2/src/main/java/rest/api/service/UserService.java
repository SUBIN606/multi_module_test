package rest.api.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rest.api.domain.User;
import rest.api.repository.UserMapper;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public User findAllUsers() {
        return userMapper.findAllUsers();
    }
}
