public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData); // registered to weatherdata subject
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData); // registered to weatherdata subject

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(62, 70, 29.2f);
    }
}
