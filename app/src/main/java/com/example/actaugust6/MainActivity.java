package com.example.actaugust6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    /// new change or update at AS

    TextView tv;
   // TextView cv;
  //  TextView format;
 //   SharedPreferences sp;
  //  SharedPreferences.Editor ed;
    String dateTime;
    Calendar calendar;
    SimpleDateFormat simpleDateFormat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.t1);
      ///  cv=findViewById(R.id.t2);
   ///     format=findViewById(R.id.t3);

        Log.d("abc123TAG", "onCreate:  executed ");


   //     sp=getSharedPreferences("spre",MODE_PRIVATE);
  //      ed= sp.edit();


    }

 /*   @Override
    protected void onStart() {
        super.onStart();
        Log.d("abc123TAG", "onStart:  executed ");
    }*/

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("abc123TAG", "onResume:  executed ");
        tv.setText("\n"+tv.getText().toString()+"\n"+"user is Online now");
   //     cv.setText(sp.getString("gup",format.getText().toString()));


    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("abc123TAG", "onPause:  executed ");
       // tv.setText("user is offline now");
        calendar = Calendar.getInstance();
        simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss aaa z");
        dateTime = simpleDateFormat.format(calendar.getTime()).toString();
        tv.setText("\n"+tv.getText().toString()+"\n"+" last seen on "+dateTime);
      //  ed.putString("gup",format.getText().toString());
      //  ed.commit();
///ggg

    }
/*
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("abc123TAG", "onStop:  executed ");

    }*/

   /* @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("abc123TAG", "onDestroy:  executed ");



    }*/
    }
