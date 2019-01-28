package com.example.hyerin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        switch (item.getItemId()) {
            case R.id.Home:
                Toast.makeText(this, "Home 화면입니다.", Toast.LENGTH_SHORT).show();
                Intent settingIntent = new Intent(this,Main2Activity.class);
                startActivity(settingIntent);
                return true;
            case R.id.Write:
                Toast.makeText(this, "일정 작성 화면입니다.", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.List:
                Toast.makeText(this, "내 일정 목록 화면입니다.", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.Logout:
                Toast.makeText(this, "로그아웃되었습니다.", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }
}
