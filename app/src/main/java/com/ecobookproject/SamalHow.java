package com.ecobookproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SamalHow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.samal_how);
    }

    public void samalHow(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.samal_back) {
            i = new Intent(this, Samal.class);
            startActivity(i);
        }
    }
}
