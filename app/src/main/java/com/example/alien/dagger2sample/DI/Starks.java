package com.example.alien.dagger2sample.DI;

public class Starks implements House {
    @Override
    public void prepareForWar() {
        //что-то происходит
        System.out.println(this.getClass().getSimpleName() + " prepared for war");
    }

    @Override
    public void reportForWar() {
//что-то происходит
        System.out.println(this.getClass().getSimpleName() + " reporting..");
    }
}
