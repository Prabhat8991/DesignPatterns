package observerpattern.correctimpl;

import observerpattern.misguidedimpl.WeatherDataFake;

public class CurrentConditionsDisplay implements Observer, Display {

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay (WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        if (temperature < 15) {
            System.out.println("Current condition looks cold based on temperature " + this.temperature + " and humidity " + this.humidity);
        } else if(temperature > 30) {
            System.out.println("Current condition looks hot based on temperature " + this.temperature + " and humidity " + this.humidity);
        } else {
            System.out.println("Current condition looks pleasant based on temperature " + this.temperature + " and humidity " + this.humidity);
        }
    }

    @Override
    public void update() {
       this.temperature = weatherData.getTemperature();
       this.humidity = weatherData.getHumidity();
       display();
    }
}
