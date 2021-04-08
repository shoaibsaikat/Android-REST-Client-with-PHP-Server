package com.shoaibsaikat.restclient;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.shoaibsaikat.MESSAGE";
    public static final String LOG_TAG = "REST_CLIENT";

    RequestQueue queue;
    // TODO: change below url according to your implementation
    String url ="http://192.168.0.105/RESTServer/getposts.php";

    // Request a string response from the provided URL.
    StringRequest stringRequest = new StringRequest(
            Request.Method.GET, url, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    sendMessage(response);
                    //Log.d(LOG_TAG, response);
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Log.e("REST_CLIENT", error.toString());
                    Toast.makeText(getApplicationContext(), "Error in collecting data", Toast.LENGTH_LONG).show();
                }
            });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Instantiate the RequestQueue.
        queue = Volley.newRequestQueue(this);
        // Add the request to the RequestQueue.
        queue.add(stringRequest);
    }

    public void sendMessage(String message) {
        Intent intent = new Intent(this, RestListActivity.class);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
        finish();
    }
}
