package com.ecobookproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Samal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.samal);
    }

    public void samalProcess(View v){
        Intent i =null, chooser=null;
        if(v.getId() == R.id.samal_home){
            i = new Intent(this,HomePage.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.samal_map){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:7.104710, 125.704974"));
            chooser = Intent.createChooser(i, "Choose a Map app");
            startActivity(chooser);
        }
        else if(v.getId() == R.id.samal_htgt){
            i = new Intent(this,SamalHow.class);
            startActivity(i);
        }
    }
}
