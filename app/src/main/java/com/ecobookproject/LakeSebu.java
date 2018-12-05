package com.ecobookproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LakeSebu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lake_sebu);
    }

    public void lakeProcess(View v){
        Intent i =null, chooser=null;
        if(v.getId() == R.id.lake_home){
            i = new Intent(this,HomePage.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.lake_map){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo://6.247040, 124.559074"));
            chooser = Intent.createChooser(i, "Choose a Map app");
            startActivity(chooser);
        }
        else if(v.getId() == R.id.lake_htgt){
            i = new Intent(this,LakeHow.class);
            startActivity(i);
        }
    }
}
