package com.example.marisaariesti.marisaariesti_1202150263_modul3;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


    Toast toast = Toast.makeText(this, "Loading", Toast.LENGTH_LONG);
        toast.show();

    final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
        @Override
        public void run() {

            Toast.makeText(SplashScreen.this, "Welcome", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(getApplicationContext(), SplashScreen.class));
            Intent intent = new Intent(SplashScreen.this, Login.class);
            startActivity(intent);
            finish();
        }
    },3000L);
}
}
