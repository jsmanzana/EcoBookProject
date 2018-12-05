package com.ecobookproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IslaHow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.isla_how);
    }

    public void islaHow(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.isla_back) {
            i = new Intent(this, Isla.class);
            startActivity(i);
        }
    }
}
