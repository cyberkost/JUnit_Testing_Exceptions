package homework_05_16_2023;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class LoggerTest {
    @Test
    public void testLog() {
        Logger loggerMock = Mockito.mock(Logger.class);
        Logger.SomeClass someObject = new Logger.SomeClass(loggerMock);
        someObject.doSomething();
        Mockito.verify(loggerMock, Mockito.atLeastOnce()).log(Mockito.anyString());
    }
}