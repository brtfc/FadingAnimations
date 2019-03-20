package com.princeadom.fadinganimations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean ironmanIsShowing = true;
    ImageView ironman_imgVw;

    public void fadeImage(View view){
        ImageView ultron_imgVw = findViewById(R.id.ultron);
        ironman_imgVw = findViewById(R.id.ironman);

        //setDuration() takes as arguments the number of seconds measured in milliseconds
        // 1 second = 1000 millisecond
        //alpha() takes a value between 0 and 1
/*
    //toggle between the two images after a set period fo time

        if(ironmanIsShowing){
            //fade out the ultron imageview
            ultron_imgVw.animate().alpha(0).setDuration(30000);
            //fade in the ironman imageview simultaneously
            ironman_imgVw.animate().alpha(1).setDuration(30000);
            ironmanIsShowing = false;
        }
        else {
            //fade out the ultron imageview
            ultron_imgVw.animate().alpha(1).setDuration(30000);
            //fade in the ironman imageview simultaneously
            ironman_imgVw.animate().alpha(0).setDuration(30000);
            ironmanIsShowing = true;
        }
*/

    //performing translations
        //nehative values denote opposite direction
        //ironman_imgVw.animate().translationXBy(-700).setDuration(15000);
        //ultron_imgVw.animate().x(-700).setDuration(15000);
        //ironman_imgVw.animate().rotation(18000).setDuration(30000);
        //ironman_imgVw.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);

        //spin the image from the left
        //ironman_imgVw.animate().alpha(1).rotation(1800).translationX(10).setDuration(5000);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //any code placed here would self-execute once the application is launched
        //position the image outside the main view by either using the animate() or setX()
        //ironman_imgVw.animate().translationX(-1000);
        ironman_imgVw = findViewById(R.id.ironman);
        //ironman_imgVw.setX(-1000);
        ironman_imgVw.setTranslationX(-1000);

        //position the image back to the screen
        ironman_imgVw.animate().translationXBy(1000).rotation(3600).setDuration(2000);

    }
}
