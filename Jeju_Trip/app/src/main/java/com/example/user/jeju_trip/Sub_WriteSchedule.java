package com.example.user.jeju_trip;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import java.util.jar.Attributes;
import android.util.AttributeSet;

public class Sub_WriteSchedule extends LinearLayout{
    public Sub_WriteSchedule(Context context, AttributeSet attrs) {
        super(context, attrs);

        init(context);
    }

    public Sub_WriteSchedule(Context context) {
        super(context);

        init(context);
    }
    private void init(Context context){
        LayoutInflater inflater =(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.sub_wirte_schedule,this,true);
    }
}
