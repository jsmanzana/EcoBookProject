package com.ecobookproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SouthernHow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.southern_how);
    }

    public void southernHow(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.southern_back) {
            i = new Intent(this, SouthernCebu.class);
            startActivity(i);
        }
    }
}
