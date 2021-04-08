package com.shoaibsaikat.restclient;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class RestListActivity extends AppCompatActivity {

    TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rest_list);

        tvMessage = findViewById(R.id.textViewMessage);
        tvMessage.setText("");

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        //Log.d(MainActivity.LOG_TAG, message);
        try {
            JSONArray jsonArr = new JSONArray(message);
            for (int i = 0; i < jsonArr.length(); i++)
            {
                JSONObject jsonObj = jsonArr.getJSONObject(i);
                //Log.d(MainActivity.LOG_TAG, jsonObj.toString());
                tvMessage.append(jsonObj.toString() + "\n\n");
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}