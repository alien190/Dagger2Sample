package com.example.alien.dagger2sample.DI;

import dagger.Component;

@Component(modules = BraavosModule.class)
public interface BattleComponent {

    War getWar();

    Cash getCash();

    Soldiers getSoliers();
}
