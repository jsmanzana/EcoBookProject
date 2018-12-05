package com.ecobookproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Batad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.batad);
    }

    public void batadProcess(View v){
        Intent i =null, chooser=null;
        if(v.getId() == R.id.batad_home){
            i = new Intent(this,HomePage.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.batad_map){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo://16.945879, 121.128591"));
            chooser = Intent.createChooser(i, "Choose a Map app");
            startActivity(chooser);
        }
        else if(v.getId() == R.id.batad_htgt){
            i = new Intent(this,BatadHow.class);
            startActivity(i);
        }
    }
}
