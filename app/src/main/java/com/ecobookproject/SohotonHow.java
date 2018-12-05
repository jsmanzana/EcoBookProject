package com.ecobookproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SohotonHow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sohoton_how);
    }

    public void sohotonHow(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.sohoton_back) {
            i = new Intent(this, SohotonBay.class);
            startActivity(i);
        }
    }
}
