package com.example.user.jeju_trip;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.HttpURLConnection;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void adsf() throws IOException {
        URL url = new URL("http://myks790.iptime.org:8888/api/plan/list?classification=popularity&size=25&sort=id%2Cdesc");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        try {
            InputStream inputStream = new BufferedInputStream(conn.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
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
            for(Object jsonItem : jsonCON){
                System.out.println(((JSONObject) jsonItem).get("title").toString());
            }
            JSONObject jsonname = (JSONObject) jsonCON.get(1);
            System.out.println(jsonname.get("title"));



        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}