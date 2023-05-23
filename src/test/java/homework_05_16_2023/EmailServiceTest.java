package homework_05_16_2023;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;

class EmailServiceTest {
    @Test
    public void testSendEmail() {
        EmailClient emailClient = Mockito.mock(EmailClient.class);
        EmailService emailService = new EmailService(emailClient);
        String recipient = "google@gmail.com";
        String message = "Some message";
        emailService.sendEmail(recipient, message);
        verify(emailClient).sendEmail(recipient, message);
    }
}