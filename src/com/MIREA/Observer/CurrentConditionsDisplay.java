package com.MIREA.Observer;

import java.util.Observable;
import java.util.Observer;


public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humdity;
    Observable observable;

    public CurrentConditionsDisplay(Observable observable) {
        /**
         * Построить предмет (наблюдаемый объект) и указать текущий объект в качестве наблюдателя
         */
        this.observable = observable;
        observable.addObserver(this);
    }


    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humdity + "%humdity");
    }

    @Override
    public void update(Observable o, Object arg) {
        /**
         * В методе update () сначала определите, является ли наблюдатель объектом текущего наблюдателя, а затем извлекайте данные в наблюдателе.
         */
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.humdity = weatherData.getHumidity();
            this.temperature = weatherData.getTemperature();
            display();
        }
    }
}

