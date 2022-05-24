package com.example.a21173065;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CallActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);


    }

    public void onCallClicked(View v){
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel: 21173065"));
        startActivity(myIntent);
    }
}