package com.ecobookproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LakeHow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lake_how);
    }

    public void lakeHow(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.lake_back) {
            i = new Intent(this, LakeSebu.class);
            startActivity(i);
        }
    }
}
