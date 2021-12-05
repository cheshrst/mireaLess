package com.MIREA.secondHomework;

public class Robot extends Unit implements Subscriber {
    public Robot(String name){
        this.name = name;
    }

    @Override
    public void deadUnit() {
        System.out.println(name + " погибает");
    }

    @Override
    public void createUnit() {
        System.out.println(name + " создан");
    }

    @Override
    public void moveUnit() {
        System.out.println(name + " двигается");
    }

    @Override
    public void fightUnit() {
        System.out.println(name + " сражается");
    }

    @Override
    public void getAlarm(String alarm) {
        System.out.println(name + " Получил сообщение от смотрителя: " + alarm);
        System.out.println("Мой бравый генерал справится!");
    }
    @Override
    public String toString() {
        return "Admiral{" +
                "name='" + name + '\'' +
                '}';
    }
}