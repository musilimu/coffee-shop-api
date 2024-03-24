package cafe.camellia.api.user;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class UserService implements UserInterface{
    @Override
    public User createUser(User user) {
        return user;
    }

    @Override
    public User updateUser(String id, User user) {
        return user;
    }

    @Override
    public String loginUser(User emailPassword) {
        return emailPassword.toString();
    }
}
