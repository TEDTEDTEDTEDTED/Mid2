package com.fju.mid2.mid2;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



public class Func1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_func1);



    }

    public void roll(View view) {


        int ram = (int)(Math.random()*6+1);

            new AlertDialog.Builder(this)
                    .setMessage("亂數"+ram)
                            .setPositiveButton("OK",null)
                            .setNeutralButton("Cancel",null)
                            .show();


        }













}
