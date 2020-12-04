package hiber.service;

import hiber.model.User;

import java.net.URI;
import java.util.List;

public interface UserService {
    void add(User user);
    List<User> listUsers();
    List<User> getUserByCar(int series, String model);
}
