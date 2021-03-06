package com.ecobookproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SohotonBay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sohoton_bay);
    }

    public void sohotonProcess(View v){
        Intent i =null, chooser=null;
        if(v.getId() == R.id.sohoton_home){
            i = new Intent(this,HomePage.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.sohoton_map){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:9.616327, 125.898047"));
            chooser = Intent.createChooser(i, "Choose a Map app");
            startActivity(chooser);
        }
        else if(v.getId() == R.id.sohoton_htgt){
            i = new Intent(this,SohotonHow.class);
            startActivity(i);
        }
    }
}

