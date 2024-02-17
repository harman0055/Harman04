package com.example.harman04;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Button = findViewById(R.id.button);

        Button.setOnClickListener(clk -> {
            // Handle the button click
            Intent nextPage = new Intent(MainActivity.this, Secondactivity.class);
            startActivity(nextPage);
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.w( "MainActivity", "Application is now visible on screen" );

    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.w( "MainActivity", "Application is now responding to the user input" );

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w( "MainActivity", "In onCreate() - Loading Widgets" );

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.w( "MainActivity", "In onCreate() - Loading Widgets" );

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w( "MainActivity", "In onCreate() - Loading Widgets" );

    }

}