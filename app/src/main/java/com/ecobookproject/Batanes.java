package com.ecobookproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Batanes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.batanes);
    }

    public void batanesProcess(View v){
        Intent i =null, chooser=null;
        if(v.getId() == R.id.batanes_home){
            i = new Intent(this,HomePage.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.batanes_map){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:20.440010, 121.964937"));
            chooser = Intent.createChooser(i, "Choose a Map app");
            startActivity(chooser);
        }
        else if(v.getId() == R.id.batanes_htgt){
            i = new Intent(this,BatanesHow.class);
            startActivity(i);
        }
    }
}
