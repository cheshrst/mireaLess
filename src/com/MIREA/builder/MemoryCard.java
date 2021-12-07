package com.MIREA.builder;

public class MemoryCard {

    public void insert() {
        System.out.println("Карта памяти успешно вставлена!");
    }
    public String[] copy(){
    String[] data = new String[3];
        data[0] = "Videos";
        data[1] = "Homework";
        data[2] = "Photos";
        return data;
    }
    public void copyData() {
        for(int i = 0; i < copy().length; i++){
            System.out.println(copy()[i]);
        }
        System.out.println("Данные скопированы на компьютер!");
    }
}
