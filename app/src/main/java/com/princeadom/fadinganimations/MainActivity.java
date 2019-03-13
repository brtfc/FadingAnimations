package com.princeadom.fadinganimations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void fadeImage(View view){
        ImageView ultron_imgVw = findViewById(R.id.ultron);
        //image view for ironman
        ImageView ironman_imgVw = findViewById(R.id.ironman);
        boolean ironmanIsShowing = true;

        if(ironmanIsShowing){
            //fade out the ultron imageview
            ultron_imgVw.animate().alpha(0).setDuration(30000);
            //fade in the ironman imageview simultaneously
            ironman_imgVw.animate().alpha(1).setDuration(30000);
            ironmanIsShowing = false;
        }
        else {
            //fade out the ultron imageview
            ultron_imgVw.animate().alpha(0).setDuration(30000);
            //fade in the ironman imageview simultaneously
            ironman_imgVw.animate().alpha(1).setDuration(30000);
            ironmanIsShowing = true;
        }

        //setDuration() takes as arguments the number of seconds but measured in milliseconds
        // 1 second = 1000 millisecond
        //alpha() takes a value between 0 and 1



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
