package com.example.vidyaanandmatadeen_ceng319lab1_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class AI_Activity extends AppCompatActivity {
    TextView message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_i_);
        Log.d("Lifecycle", "In the onCreate() event");
        message = (TextView) findViewById(R.id.textView2);

    }
    public void onStart()
    {
        super.onStart();
        Log.d("Lifecycle", "In the onStart() event");
        String onStart = getString(R.string.onStart_t);
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
