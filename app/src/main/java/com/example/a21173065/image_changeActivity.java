package com.example.a21173065;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

public class image_changeActivity extends AppCompatActivity {

    ImageView imageView1;
    ImageView imageView2;

    int imageIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_change);

        imageView1 = findViewById(R.id.catView1);
        imageView2 = findViewById(R.id.dogView1);
    }

    public void onButtonClicked(View v){
        changImage();
    }

    private void changImage() {
        if(imageIndex == 0){
            imageView1.setVisibility(View.VISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageIndex = 1;
        }
        else if(imageIndex == 1){
            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.VISIBLE);
            imageIndex = 0;
        }

    }


}