package com.example.recyclerviewweek18;

import android.graphics.Color;
import android.provider.CalendarContract;

import java.util.Random;

public class RandomColors {


    public  static  int getColor(){
        Integer [] color = new Integer[3];
        color[0] = Color.RED;
        color[1]= Color.BLUE;
        color[2] = Color.YELLOW;
        Random rnd = new Random();
        return Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));

    }
}
