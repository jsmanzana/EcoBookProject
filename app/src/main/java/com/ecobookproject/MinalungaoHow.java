package com.ecobookproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MinalungaoHow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.minalungao_how);
    }

    public void minalungaoHow(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.minalungao_back) {
            i = new Intent(this, MinalungaoNationalPark.class);
            startActivity(i);
        }
    }
}
