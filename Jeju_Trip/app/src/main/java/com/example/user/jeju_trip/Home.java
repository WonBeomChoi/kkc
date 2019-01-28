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
import java.util.ArrayList;

public class Home extends AppCompatActivity {

    ArrayList<String> data;
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

//        final String[] items = {"HOME", "일정 작성하기", "내 일정목록 보기", "LOG OUT"} ;
//        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, items) ;
//
//        ListView listview = (ListView) findViewById(R.id.drawer_menulist) ;
//        listview.setAdapter(adapter) ;
//
//        listview.setOnItemClickListener(new ListView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView parent, View v, int position, long id) {
//                switch (position) {
//                    case 0 :
//
//                        break ;
//                    case 1 :
//
//                        break ;
//                    case 2 :
//
//                        break ;
//                    case 3 :
//
//                        break ;
//                    default:
//                        break;
//                }
//
//                // 코드 계속 ...
//            }
//        });

    }
}
