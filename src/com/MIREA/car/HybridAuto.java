package com.MIREA.car;

public class HybridAuto extends Auto {

    public HybridAuto() {
        this.fillStrategy = new HybridFillStrategy();
    }
}
