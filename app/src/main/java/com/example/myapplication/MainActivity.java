package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Log分为Verbose,info,debug,warning,error信息
        Log.d("ios","相当于iOS的viewdidload");

       Button btn = findViewById(R.id.button_click);

       //接口方法I
       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent tent = new Intent(MainActivity.this,TestActivity.class);
               startActivity(tent);
           }
       });

    }

    

}