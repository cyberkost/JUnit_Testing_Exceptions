package homework_05_16_2023;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class EmailSenderTest {
    @Test
    public void testSendEmail() {
        EmailSender emailSender = Mockito.mock(EmailSender.class);
        emailSender.sendEmail("John", "How are you today?");
        Mockito.verify(emailSender).sendEmail("John", "How are you today?");
    }
}