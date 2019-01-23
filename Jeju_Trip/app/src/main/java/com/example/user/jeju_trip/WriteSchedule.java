package com.example.user.jeju_trip;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class WriteSchedule extends AppCompatActivity {

    Button plus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.write_schedule);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sub_WriteSchedule n_layout = new Sub_WriteSchedule(getApplicationContext());
                LinearLayout con = (LinearLayout)findViewById(R.id.con);
                con.addView(n_layout);

                Button but = (Button) findViewById(R.id.Plus);
                but.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(WriteSchedule.this, "클릭되었습니다.", Toast.LENGTH_LONG).show();
                    }
                });
            }
        });

    }
}


