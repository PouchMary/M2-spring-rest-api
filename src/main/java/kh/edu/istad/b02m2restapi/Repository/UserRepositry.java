
package kh.edu.istad.b02m2restapi.Repository;

import kh.edu.istad.b02m2restapi.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class UserRepositry {

    private List<User> users;

    public UserRepositry() {
        users = new ArrayList<>();

        User userAdmin = new User(
                "Administrator", "admin", "qwer", true, UUID.randomUUID()
        );

        User userEditor = new User(
                "Editor", "editor", "qwer", false, UUID.randomUUID()
        );

        users.add(userAdmin);
        users.add(userEditor);
    }

    public List<User> selectAll() {
        return users;
    }

    public Optional<User> selectById(UUID id) {
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();
    }

    public void insert(User user) {
        users.add(user);
    }

    public void deleteById(UUID id) {
        users.removeIf(user -> user.getId().equals(id));
    }


}
