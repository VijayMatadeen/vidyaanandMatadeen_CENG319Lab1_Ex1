package com.example.vidyaanandmatadeen_ceng319lab1_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;

public class MainActivity extends AppCompatActivity {
    private Button AI;
    private Button VR;
    TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Lifecycle", "In the onCreate() event");
        message = (TextView) findViewById(R.id.textResult);
        String onCreate = getString(R.string.onCreate_t);
        Toast.makeText(MainActivity.this, onCreate ,Toast.LENGTH_SHORT).show();
        AI = (Button) findViewById(R.id.AI);
        VR = (Button) findViewById(R.id.VR);

        AI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAI();
            }
        });

        VR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAI();
            }
        });
    }
        public void openAI() {
            Intent intent = new Intent(this, AI_Activity.class);
            startActivity(intent);

        }
    public void openVR() {
        Intent intent = new Intent(this, VR_Act.class);
        startActivity(intent);

    }


    public void onStart()
    {
        super.onStart();
        Log.d("Lifecycle", "In the onStart() event");
        String onStart = getString(R.string.onStart_t);
        Toast.makeText(MainActivity.this, onStart ,Toast.LENGTH_SHORT).show();
        message.setText(onStart);
    }
    //
    public void onRestart()
    {
        super.onRestart();
        Log.d("Lifecycle", "In the onRestart() event");
        String onRestart = getString(R.string.onRestart_t);
        message.setText(onRestart);
    }
    public void onResume()
    {
        super.onResume();
        Log.d("Lifecycle", "In the onResume() event");
        String onResume = getString(R.string.onResume_t);
        message.setText(onResume);
    }
    public void onPause()
    {
        super.onPause();
        Log.d("Lifecycle", "In the onPause() event");
        String onPause = getString(R.string.onPause_t);
        message.setText(onPause);
    }
    //
    public void onStop()
    {
        super.onStop();
        Log.d("Lifecycle", "In the onStop() event");
        String onStop = getString(R.string.onStop_t);
        message.setText(onStop);
    }
    public void onDestroy()
    {
        super.onDestroy();
        Log.d("Lifecycle", "In the onDestroy() event");
        String onDestroy = getString(R.string.onDestroy_t);
        message.setText(onDestroy);
    }


}