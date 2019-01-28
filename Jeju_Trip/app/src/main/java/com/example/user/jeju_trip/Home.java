package com.example.user.jeju_trip;

import android.os.AsyncTask;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.support.v4.widget.DrawerLayout;
import android.widget.ListView;
import android.widget.AdapterView;
<<<<<<< HEAD
import android.content.Intent;
import java.util.ArrayList;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
=======
import java.util.ArrayList;
>>>>>>> 886aa7022e23e13520aaa70145064034f10423f5

public class Home extends AppCompatActivity {

    ArrayList<String> data;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (item.getItemId()) {
            case R.id.Home:
                Toast.makeText(this, "Home 화면입니다.", Toast.LENGTH_SHORT).show();
                Intent Home = new Intent(this, Home.class);
                startActivity(Home);
                return true;
            case R.id.Write:
                Toast.makeText(this, "일정 작성 화면입니다.", Toast.LENGTH_SHORT).show();
                Intent WriteSchedule = new Intent(this, WriteSchedule.class);
                startActivity(WriteSchedule);
                return true;
            case R.id.List:
                Toast.makeText(this, "내 일정 목록 화면입니다.", Toast.LENGTH_SHORT).show();
                Intent PlanList = new Intent(this, PlanList.class);
                startActivity(PlanList);
                return true;
            case R.id.Logout:
                Toast.makeText(this, "로그아웃되었습니다.", Toast.LENGTH_SHORT).show();
                Intent Logout = new Intent(this, Logout.class);
                startActivity(Logout);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        data = new ArrayList<>();
        data.add("제목1");
        data.add("제목2");
        data.add("제목3");
        RecyclerView recyclerView = findViewById(R.id.list_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyRecyclerAdaprter(data));


    }
}
