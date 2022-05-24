package com.example.a21173065;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn_imgMove;
    Button btn_callMove;

    EditText text_Input;
    String str;
    Button btn_textMove;

    Button btn_svMove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //이미지바꾸기 작업
        btn_imgMove = findViewById(R.id.btn_imgMove);
        btn_imgMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent imgIntent = new Intent(MainActivity.this,image_changeActivity.class);
                startActivity(imgIntent);
            }
        });


        //전화걸기 작업
        btn_callMove = findViewById(R.id.btn_callMove);
        btn_callMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(MainActivity.this,CallActivity.class);
                startActivity(callIntent);
            }
        });


        //EditText
        text_Input = findViewById(R.id.text_Input);


        //텍스트보내기 작업
        btn_textMove = findViewById(R.id.btn_textMove);
        btn_textMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent msgIntent = new Intent(MainActivity.this,messageActivity.class);
                str = text_Input.getText().toString();
                msgIntent.putExtra("sendMsg",str);
                startActivity(msgIntent);
            }
        });


                //스크롤뷰 작업
                btn_svMove = findViewById(R.id.btn_svMove);
        btn_svMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent svIntent = new Intent(MainActivity.this,scroll_viewActivity.class);
                startActivity(svIntent);
            }
        });




    }
}