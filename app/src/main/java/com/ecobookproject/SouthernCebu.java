package com.ecobookproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SouthernCebu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.southern_cebu);
    }

    public void southernProcess(View v){
        Intent i =null, chooser=null;
        if(v.getId() == R.id.southern_home){
            i = new Intent(this,HomePage.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.southern_map){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo://9.759986, 123.366146"));
            chooser = Intent.createChooser(i, "Choose a Map app");
            startActivity(chooser);
        }
        else if(v.getId() == R.id.southern_htgt){
            i = new Intent(this,SouthernHow.class);
            startActivity(i);
        }
    }
}
