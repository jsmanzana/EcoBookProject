package com.ecobookproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Siquijor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.siquijor);
    }

    public void process(View v){
        Intent i =null, chooser=null;
        if(v.getId() == R.id.siquijor_home){
            i = new Intent(this,HomePage.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.siquijor_map){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo://14.0610410, 120.991841"));
            chooser = Intent.createChooser(i, "Choose a Map app");
            startActivity(chooser);
        }
        else if(v.getId() == R.id.siquijor_htgt){
            i = new Intent(this,SiquijorHow.class);
            startActivity(i);
        }
    }
}
