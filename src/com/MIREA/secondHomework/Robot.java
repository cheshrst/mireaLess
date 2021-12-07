package com.MIREA.secondHomework;

public class Robot extends Unit {
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
    public String toString() {
        return null;
    }

    @Override
    public void moveUnit() {
        System.out.println(name + " двигается");
    }

    @Override
    public void fightUnit() {
        System.out.println(name + " сражается");
    }


}