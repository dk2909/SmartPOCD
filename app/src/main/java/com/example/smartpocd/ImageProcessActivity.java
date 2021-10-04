package com.example.smartpocd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ImageProcessActivity extends AppCompatActivity {

    // declare sampling tutorial button
    private Button SampleTutorial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_process);

        SampleTutorial = (Button) findViewById(R.id.tutorial);
        SampleTutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ImageProcessActivity.this,sampling_tutorial.class);
                startActivity(intent);
            }
        });







    }
}