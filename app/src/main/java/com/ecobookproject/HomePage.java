package com.ecobookproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();

    }

    public void exit(View v){
        if (v.getId() == R.id.btnExit) {
            finish();
            System.exit(0);
        }
    }
}
