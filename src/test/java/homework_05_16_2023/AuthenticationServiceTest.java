package homework_05_16_2023;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class AuthenticationServiceTest {
    @Test
    public void testAuthenticateUser() {
        RepositoryUser repositoryUser = Mockito.mock(RepositoryUser.class);
        AuthenticationService authenticationService = new AuthenticationService(repositoryUser);
        String userId = "user123";
        User expectedUser = new User(userId, "password");
        when(repositoryUser.getUserById(userId)).thenReturn(expectedUser);
        User result = authenticationService.authenticateUser(userId, "password");
        verify(repositoryUser).getUserById(userId);
        assertEquals(expectedUser, result);
    }
}