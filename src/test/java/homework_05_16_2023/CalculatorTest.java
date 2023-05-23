package homework_05_16_2023;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculatorMock = Mockito.mock(Calculator.class);
        calculatorMock.add(20, 30);
        verify(calculatorMock).add(20, 30);
    }
}
