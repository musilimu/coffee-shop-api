package cafe.camellia.api.user;

public interface UserInterface {
    public User createUser(User user);
    public User updateUser(User user);
    public String loginUser(String email, String password);
}
