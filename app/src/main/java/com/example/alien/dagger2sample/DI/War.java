package com.example.alien.dagger2sample.DI;

public class War {
    private Starks mStarks;
    private Boltons mBoltons;

    public War () {
        mStarks = new Starks();
        mBoltons = new Boltons();

        mStarks.prepareForWar();
        mStarks.reportForWar();

        mBoltons.prepareForWar();
        mBoltons.reportForWar();
    }
}
