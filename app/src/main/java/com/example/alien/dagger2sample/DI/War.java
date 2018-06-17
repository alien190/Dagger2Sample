package com.example.alien.dagger2sample.DI;

import javax.inject.Inject;

public class War {
    private Starks mStarks;
    private Boltons mBoltons;


    @Inject
    public War(Starks starks, Boltons boltons) {
        mStarks = starks;
        mBoltons = boltons;
    }

    public void prepare() {
        mStarks.prepareForWar();
        mStarks.reportForWar();
    }

    public void report() {
        mBoltons.prepareForWar();
        mBoltons.reportForWar();
    }
}
