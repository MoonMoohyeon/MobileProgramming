package mp.team8.cofinder.Service;

import mp.team8.cofinder.Entity.User;
import mp.team8.cofinder.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User registerUser(User user) {
        return userRepository.save(user);
    }

    public User loginUser(String username, String password) {
        // 데이터베이스에서 username으로 사용자를 찾습니다.
        Optional<User> user = Optional.ofNullable(userRepository.findByUsername(username));

        // 사용자가 존재하고 비밀번호가 일치하면 해당 사용자 객체를 반환합니다.
        if (user.isPresent() && user.get().getPassword().equals(password)) {
            return user.get();
        } else {
            // 사용자가 존재하지 않거나 비밀번호가 일치하지 않는 경우 null을 반환합니다.
            return null;
        }
    }
}
