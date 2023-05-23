package homework_05_16_2023;

public class WeatherService {
    private WeatherAPI weatherAPI;

    public WeatherService(WeatherAPI weatherAPI) {
        this.weatherAPI = weatherAPI;
    }

    public double getTemperature(String city) {
        return weatherAPI.getTemperature(city);
    }
}

class WeatherAPI {
    public double getTemperature(String city) {
        return 0.0;
    }
}
