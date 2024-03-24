package cafe.camellia.api.user;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/auth")
public class UserController implements UserInterface{
    private final UserService userService;
    @PostMapping("/register")
    @Override
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
    @PutMapping("/users/{id}")
    @Override
    public User updateUser(@PathVariable String id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }
    @PostMapping("/login")
    @Override
    public String loginUser(@RequestBody User emailPassword) {
        return userService.loginUser(emailPassword);
    }
}
