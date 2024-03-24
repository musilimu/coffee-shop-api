package cafe.camellia.api.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class UserController implements UserInterface{
    @PostMapping("/register")
    @Override
    public User createUser(User user) {
        return null;
    }
    @PutMapping("/{id}")
    @Override
    public User updateUser(User user) {
        return null;
    }

    @PostMapping("/login")
    @Override
    public String loginUser(String email, String password) {
        return null;
    }
}
