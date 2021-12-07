package com.MIREA.pat2;


public class Oleg extends Human {

    public void sayHello(){
        System.out.println("Oleg hello");
    }

    public void calculate(){
        String[] numbers= new String[3];
        numbers[0] = "One";
        numbers[1] = "Two";
        numbers[2] = "Three";
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
