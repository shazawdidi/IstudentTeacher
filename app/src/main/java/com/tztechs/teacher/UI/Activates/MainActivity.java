package com.tztechs.teacher.UI.Activates;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.google.android.material.snackbar.Snackbar;
import com.tztechs.teacher.R;

public class MainActivity extends AppCompatActivity {


    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);
        Snackbar.make(findViewById(R.id.contextView), R.string.loading, Snackbar.LENGTH_SHORT).show();
        int SPLASH_DISPLAY_LENGTH = 10000;
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent mainIntent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(mainIntent);
                finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}
