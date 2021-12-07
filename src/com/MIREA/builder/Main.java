package com.MIREA.builder;

public class Main {
        public static void main(String[] args) {

            USB cardReader = new CardReader(new MemoryCard());
            cardReader.connectWithUsbCable();

        }

}
