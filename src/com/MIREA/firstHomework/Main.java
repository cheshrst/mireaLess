package com.MIREA.firstHomework;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        builderAdapter();
    }

    public static void builderAdapter(){
        //Строитель + адпатер
        // Строитель позволяет создавать сложные объекты пошагово
        String[] data = new String[3];
        data[0] = "Moscow";
        data[1] = "Tokyo";
        data[2] = "Jamaika";
        //Строитель
        List<String> strings = Arrays.asList(data);
        //Адаптер
        // На вход декоратор принимает один объект и возвращает обёртку над этим объектом.
        // Отличие в том, что цель у этого не изменение функционала, а адаптация одного интерфейса к другому.
        strings.set(0, null);
        //Вывод
        System.out.println(Arrays.toString(data));
    }
}
