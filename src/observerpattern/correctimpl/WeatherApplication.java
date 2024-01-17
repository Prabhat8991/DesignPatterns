package observerpattern.correctimpl;


public class WeatherApplication {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        System.out.println();
        weatherData.setMeasurements(10, 25, 50);
        System.out.println();
        weatherData.setMeasurements(25, 20, 60);
        System.out.println();
        weatherData.setMeasurements(40, 30, 1);
    }
}
