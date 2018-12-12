package com.ecobookproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Isla extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.isla);
    }

    public void islaProcess(View v){
        Intent i =null, chooser=null;
        if(v.getId() == R.id.isla_home){
            i = new Intent(this,HomePage.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.isla_map){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:   11.601051, 123.339914"));
            chooser = Intent.createChooser(i, "Choose a Map app");
            startActivity(chooser);
        }
        else if(v.getId() == R.id.isla_htgt){
            i = new Intent(this,IslaHow.class);
            startActivity(i);
        }
    }
}
