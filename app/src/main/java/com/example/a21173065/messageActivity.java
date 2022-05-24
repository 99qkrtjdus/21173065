package com.example.a21173065;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class messageActivity extends AppCompatActivity {

    TextView tView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        //메인에서 보낸 값을 받는다.

        tView = findViewById(R.id.textView);
        Intent msgIntent = getIntent();
        String str = msgIntent.getStringExtra("sendMsg");
        tView.setText(str);


    }


}