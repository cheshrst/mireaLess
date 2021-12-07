package com.MIREA.secondHomework;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow;

public class Observer {


        private String name;
        private ObservationTower observationTower;

        public Observer(String name, ObservationTower observationTower) {
            this.name = name;
            this.observationTower = observationTower;
        }

        public void lookAtTower(){
            if(observationTower.isSignalLight()) {
                System.out.println("Смотритель " + name + " увидел сигнальный огонь и начал отправлять гонцов!");
                alarm("Враг атакует");
            }
        }

        private List<Flow.Subscriber> subscribers = new ArrayList();

        public void subscribe(Flow.Subscriber subscribe){
            subscribers.add(subscribe);
            System.out.println("Подписчик " + subscribe + " подписался на уведомления смотрителя");
        }

        public void unsubscribe(Flow.Subscriber subscribe){
            subscribers.remove(subscribe);
            System.out.println("Подписчик " + subscribe + " отписался от уведомлений смотрителя");
        }

        public void alarm(String alarm){
            for(Flow.Subscriber subscriber : subscribers){
                System.out.println("Смотритель отправил депешу " + subscriber);
                Unit.getAlarm(alarm);
                System.out.println("");
            }
        }

    public void subscribe() {
    }
}
