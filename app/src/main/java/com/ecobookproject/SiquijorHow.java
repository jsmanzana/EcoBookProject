package com.ecobookproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SiquijorHow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.siquijor_how);
    }

    public void siquijorHow(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.siquijor_back) {
            i = new Intent(this, Siquijor.class);
            startActivity(i);
        }
    }
}
