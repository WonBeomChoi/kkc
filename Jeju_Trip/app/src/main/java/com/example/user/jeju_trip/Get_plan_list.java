package com.example.user.jeju_trip;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class Get_plan_list {
    Get_plan_list(){}

    public JSONArray call_popular() throws IOException {
        JSONArray jsonPop = null;
        URL url = new URL("http://myks790.iptime.org:8888/api/plan/list?classification=popularity&size=25&sort=id%2Cdesc");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        try {
            InputStream inputStream = new BufferedInputStream(conn.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            StringBuffer stringBuffer = new StringBuffer();

            while((line = bufferedReader.readLine()) != null) {
                stringBuffer.append(line);
                stringBuffer.append(System.lineSeparator());
            }

            System.out.println(stringBuffer);
            String string = stringBuffer.toString();
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(string);
            JSONArray jsonCON = (JSONArray) jsonObject.get("content");
            jsonPop = jsonCON;


        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonPop;
    }
    public ArrayList<String> get_title() throws IOException {
        ArrayList<String> title_list = new ArrayList<>();
        Get_plan_list get_plan_list = new Get_plan_list();

        JSONArray jsonArray = get_plan_list.call_popular();
        for(Object item : jsonArray)
        {
            title_list.add(((JSONObject) item).get("title").toString());
        }
        return title_list;
    }

}
