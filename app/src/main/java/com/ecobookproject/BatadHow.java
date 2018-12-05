package com.ecobookproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BatadHow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.batad_how);
    }

    public void batadHow(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.batad_back) {
            i = new Intent(this, Batad.class);
            startActivity(i);
        }
    }
}
