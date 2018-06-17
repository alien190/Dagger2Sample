package com.example.alien.dagger2sample.DI;

import dagger.Module;
import dagger.Provides;

@Module
public class BraavosModule {

    Cash mCash;
    Soldiers mSoldiers;

    public BraavosModule(Cash mCash, Soldiers mSoldiers) {
        this.mCash = mCash;
        this.mSoldiers = mSoldiers;
    }

    @Provides
    Cash provideCash(){
        return mCash;
    }

    @Provides
    Soldiers provideSoldiers(){
        return mSoldiers;
    }
}
