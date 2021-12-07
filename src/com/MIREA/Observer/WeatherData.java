package com.MIREA.Observer;


import java.util.Observable;

/**
 * Объект, под наблюдением, унаследованный от встроенного в Java Observable
 * @author acer
 *
 */
public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public WeatherData() {

    }

    public void measuermentsChanged() {
        /**
         * Перед вызовом notifyObservers () сначала используйте setChanged (), чтобы указать, что статус изменился
         */
        this.setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measuermentsChanged();
    }

}