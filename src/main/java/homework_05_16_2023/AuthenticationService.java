package homework_05_16_2023;

public class AuthenticationService {
    private RepositoryUser repositoryUser;

    public AuthenticationService(RepositoryUser repositoryUser) {
        this.repositoryUser = repositoryUser;
    }

    public User authenticateUser(String userId, String password) {
        return repositoryUser.getUserById(userId);
    }
}

class RepositoryUser {
    public User getUserById(String userId) {
        return null;
    }
}

class ServiceUser {
    private String userId;
    private String password;

    public ServiceUser(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }
}