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

    public void homeProcess(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.sohoton) {
            i = new Intent(this, SohotonBay.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.lake){
            i = new Intent(this,LakeSebu.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.batad){
            i = new Intent(this,Batad.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.batanes){
            i = new Intent(this,Batanes.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.minalungao){
            i = new Intent(this,MinalungaoNationalPark.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.sagada){
            i = new Intent(this,Sagada.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.siquijor){
            i = new Intent(this,Siquijor.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.southern){
            i = new Intent(this,SouthernCebu.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.samal){
            i = new Intent(this,Samal.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.isla){
            i = new Intent(this,Isla.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.btnExit){
            finish();
            System.exit(0);
        }


    }
}
