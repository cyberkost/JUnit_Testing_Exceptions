package homework_05_16_2023;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class WeatherServiceTest {
    @Test
    public void testGetTemperature() {
        WeatherAPI weatherAPI = Mockito.mock(WeatherAPI.class);
        WeatherService weatherService = new WeatherService(weatherAPI);
        String city = "Nürnberg";
        double expectedTemperature = 15.5;
        when(weatherAPI.getTemperature(city)).thenReturn(expectedTemperature);
        double result = weatherService.getTemperature(city);
        verify(weatherAPI).getTemperature(city);
        assertEquals(expectedTemperature, result, 0.0);
    }
}