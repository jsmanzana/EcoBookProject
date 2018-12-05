package com.ecobookproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BatanesHow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.batanes_how);
    }

    public void batanesHow(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.batanes_back) {
            i = new Intent(this, Batad.class);
            startActivity(i);
        }
    }
}
