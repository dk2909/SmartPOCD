package com.example.smartpocd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class MainActivity extends AppCompatActivity {
    // Firebase server object
    private FirebaseStorage storage;
    // Reference to access server
    private StorageReference storageReference;
    // declare image process button
    private Button imageProcButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageProcButton = (Button) findViewById(R.id.ip_button);
        imageProcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent switchToImProcIntent = new Intent(MainActivity.this, ImageProcessActivity.class);
                startActivity(switchToImProcIntent);
            }
        });

        // get handle on server storage
        // storage = FirebaseStorage.getInstance();
        // storageReference = storage.getReference();
    }
}