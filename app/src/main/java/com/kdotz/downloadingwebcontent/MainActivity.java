package com.kdotz.downloadingwebcontent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DownloadTask task = new DownloadTask();
        String result = null;

        try {
            result = task.execute("https://zappycode.com/").get();
        } catch (Exception e){
            e.printStackTrace();
        }

        Log.i("Result", result);
    }
}
