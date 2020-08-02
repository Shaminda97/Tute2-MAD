package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textMsg2 = findViewById(R.id.msg2);
        textMsg2.setText(R.string.Msg2);
        Log.i("Lifesycle", "OnCreate called..");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Lifesycle","onStart() invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Lifecycle","onRestart() invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Lifecycle","Onresume() invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Lifecycle","Onpause() invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Lifecycle","onStop() invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Lifecycle","Ondestroy() invoked");
    }
}