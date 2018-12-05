package com.ecobookproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SagadaHow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sagada_how);
    }

    public void sagadaHow(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.sagada_back) {
            i = new Intent(this, Sagada.class);
            startActivity(i);
        }
    }
}
