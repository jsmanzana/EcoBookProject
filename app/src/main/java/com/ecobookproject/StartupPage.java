package com.ecobookproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartupPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startup_page);
    }

    public void startUp(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.btnGetStarted) {
            i = new Intent(this, HomePage.class);
            startActivity(i);
        }
    }
}
