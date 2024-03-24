package cafe.camellia.api.user;

import java.util.HashMap;
import java.util.Optional;

public interface UserInterface {
    public User createUser(User user);
    public User updateUser(String id, User user);
    public String loginUser(User emailPassword);
}
