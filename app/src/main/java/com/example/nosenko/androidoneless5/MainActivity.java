package com.example.nosenko.androidoneless5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String liveCicleName = "onCreate";
        showNameCicle(liveCicleName);
    }

    private void showNameCicle(String liveCicleName){
        Toast.makeText(getApplicationContext(), liveCicleName, Toast.LENGTH_SHORT);
    }

    @Override
    protected void onStart(){
        String liveCicleName = "onStart";
        showNameCicle(liveCicleName);
        super.onStart();
    }

    @Override
    protected void onDestroy(){
        String liveCicleName = "onDestroy";
        showNameCicle(liveCicleName);
    }

    @Override
    protected void onPause(){
        String liveCicleName = "onPause";
        showNameCicle(liveCicleName);
    }

    @Override
    protected void onResume(){
        String liveCicleName = "onResume";
        showNameCicle(liveCicleName);
    }

    @Override
    protected void onStop(){
        String liveCicleName = "onStop";
        showNameCicle(liveCicleName);
    }

    @Override
    protected void onRestart(){
        String liveCicleName = "onRestart";
        showNameCicle(liveCicleName);
    }
}
