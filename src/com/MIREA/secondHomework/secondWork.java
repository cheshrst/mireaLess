package com.MIREA.secondHomework;

public class secondWork {
    public static void main(String[] args) {
        Unit human = new Human("Igor");
        human.createUnit();
        human.moveUnit();
        human.fightUnit();
        human.deadUnit();

        System.out.println();

        Unit robot = new Robot("r2d2");
        robot.createUnit();
        robot.moveUnit();
        robot.fightUnit();
        robot.deadUnit();

        System.out.println();
    }
}
