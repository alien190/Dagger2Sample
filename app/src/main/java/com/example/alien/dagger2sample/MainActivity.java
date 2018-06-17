package com.example.alien.dagger2sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.alien.dagger2sample.DI.War;

public class MainActivity extends AppCompatActivity {

    private War mWar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWar = new War();
    }
}
