package com.MIREA.car;

public class Main {


        public static void main(String[] args) {

            ChildrenBuggies buggies = new ChildrenBuggies();
            buggies.setFillStrategy(new StandartFillStrategy());

            buggies.fill();
        }
    }

