package homework_05_16_2023;

public class EmailService {
    private EmailClient emailClient;

    public EmailService(EmailClient emailClient) {
        this.emailClient = emailClient;
    }

    public void sendEmail(String recipient, String message) {
        emailClient.sendEmail(recipient, message);
    }
}

class EmailClient {
    public void sendEmail(String recipient, String message) {
    }
}
