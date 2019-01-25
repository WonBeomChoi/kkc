package com.example.user.jeju_trip;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class WriteSchedule extends AppCompatActivity {

    Button plusButton;
    Button minusButton;
    EditText dayBox;
    TextView dayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.write_schedule);

        plusButton = (Button)findViewById(R.id.Plus);
        minusButton = (Button)findViewById(R.id.Minus);
        dayBox = (EditText)findViewById(R.id.DayNumber);
        dayText = (TextView)findViewById(R.id.DayText);

        plusButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dayBoxValue = dayBox.getText().toString();
                int dayBoxValueInt = Integer.valueOf(dayBoxValue)+1;
                dayBox.setText(String.valueOf(dayBoxValueInt));

                Sub_WriteSchedule n_layout = new Sub_WriteSchedule(getApplicationContext());
                LinearLayout con = (LinearLayout)findViewById(R.id.con);
                n_layout.changeTextView(dayBoxValueInt);
                con.addView(n_layout);
            }
        });

        minusButton.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view){
                String dayBoxValue = dayBox.getText().toString();
                int dayBoxValueInt = Integer.valueOf(dayBoxValue);
                if(dayBoxValueInt>0) dayBoxValueInt--;
                dayBox.setText(String.valueOf(dayBoxValueInt));
            }
        });
    }
}


