package observerpattern.correctimpl;

public class StatisticsDisplay implements Observer, Display {

    private float humidity;

    private float pressure;

    private float temperature;


    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Stats display: Temperature: " + this.temperature + " Humidity " + this.humidity + "pressure " + this.pressure);
    }

    @Override
    public void update() {
       this.humidity = weatherData.getHumidity();
       this.pressure = weatherData.getPressure();
       this.temperature = weatherData.getTemperature();
       display();
    }
}
