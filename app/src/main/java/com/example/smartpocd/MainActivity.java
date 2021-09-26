package com.example.smartpocd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class MainActivity extends AppCompatActivity {
    // Firebase server object
    private FirebaseStorage storage;
    // Reference to access server
    private StorageReference storageReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get handle on server storage
        // storage = FirebaseStorage.getInstance();
        // storageReference = storage.getReference();
    }
}