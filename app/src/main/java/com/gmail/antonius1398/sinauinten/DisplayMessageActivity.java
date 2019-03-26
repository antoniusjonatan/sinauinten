package com.gmail.antonius1398.sinauinten;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent =  getIntent();
        String  message =  intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView textView  =  findViewById(R.id.text1);
        textView.setText(message);
    }
}
