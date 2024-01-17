package observerpattern.correctimpl;

public class ForecastDisplay implements Observer, Display {

    private float temperature;

    private float pressure;

    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Forecast display:  Weather may change based on pressure "  + this.pressure + " and temperature " + this.temperature);
    }

    @Override
    public void update() {
       this.temperature = weatherData.getTemperature();
       this.pressure = weatherData.getPressure();
       display();
    }
}
