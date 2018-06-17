package com.example.alien.dagger2sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.alien.dagger2sample.DI.Allies;
import com.example.alien.dagger2sample.DI.BattleComponent;
import com.example.alien.dagger2sample.DI.Boltons;
import com.example.alien.dagger2sample.DI.BraavosModule;
import com.example.alien.dagger2sample.DI.Cash;
import com.example.alien.dagger2sample.DI.DaggerBattleComponent;
import com.example.alien.dagger2sample.DI.IronBank;
import com.example.alien.dagger2sample.DI.Soldiers;
import com.example.alien.dagger2sample.DI.Starks;
import com.example.alien.dagger2sample.DI.War;

public class MainActivity extends AppCompatActivity {

    private War mWar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        IronBank bank = new IronBank();
//        Allies allies = new Allies(bank);


//        Starks starks = new Starks();
//        Boltons boltons = new Boltons();
//
//        mWar = new War(starks, boltons);

        Cash cash= new Cash();
        Soldiers soldiers = new Soldiers();

        BattleComponent component = DaggerBattleComponent
                .builder()
                .braavosModule(new BraavosModule(cash, soldiers))
                .build();

        mWar = component.getWar();

        mWar.prepare();
        mWar.report();

        component.getCash();
        component.getSoliers();
    }
}
