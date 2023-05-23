package homework_05_16_2023;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;

class UserServiceTest {
    @Test
    public void testSaveUser() {
        UserRepository userRepository = Mockito.mock(UserRepository.class);
        UserService userService = new UserService(userRepository);
        User user = new User("Konstantin", "Bezgatsev");
        userService.saveUser(user);
        verify(userRepository).saveUser(user);
    }
}