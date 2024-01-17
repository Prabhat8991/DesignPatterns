package observerpattern.misguidedimpl;

public class WeatherDataFake {
    //instance variable implementations

    CurrentConditionDisplay currentConditionDisplay;
    StatisticsDisplay statisticsDisplay;
    ForecastDisplay forecastDisplay;

    public WeatherDataFake(CurrentConditionDisplay currentConditionDisplay, StatisticsDisplay statisticsDisplay, ForecastDisplay forecastDisplay) {
        this.currentConditionDisplay = currentConditionDisplay;
        this.statisticsDisplay = statisticsDisplay;
        this.forecastDisplay = forecastDisplay;
    }

    /**
     * Whenever any weather parameter changes, this method is called
     */
    public void measurementChanged() {
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        currentConditionDisplay.update(temp, humidity, pressure);
        statisticsDisplay.update(temp, humidity, pressure);
        forecastDisplay.update(temp, humidity, pressure);
    }

    /**
     *
     * @return pressure from weather station
     */
    private float getPressure() {
        return 0;
    }

    /**
     *
     * @return humidity from weather station
     */
    private float getHumidity() {
        return 0;
    }

    /**
     *
     * @return temperature from weather station
     */
    private float getTemperature() {
        return 0;
    }
}
