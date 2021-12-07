package com.MIREA.secondHomework;

import java.util.concurrent.Flow;

public class secondWork {
    public static void main(String[] args) {
        Unit human = new Human("Igor");
        ObservationTower observationTower = new ObservationTower();
        Observer observer = new Observer("Tower", observationTower);
        human.createUnit();
        human.moveUnit();
        human.fightUnit();
        human.deadUnit();
        observer.alarm("human");

        System.out.println();

        Unit robot = new Robot("r2d2");
        robot.createUnit();
        robot.moveUnit();
        robot.fightUnit();
        robot.deadUnit();

        System.out.println();
    }
}
