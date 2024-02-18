package com.example.harman04;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Instrumentation;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;

public class Secondactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
        Intent fromPrevious = getIntent();
        String EmailAddress = fromPrevious.getStringExtra("EmailAddress");
        int age = fromPrevious.getIntExtra("Age", 18);
        String name = fromPrevious.getStringExtra("Name");
        String pCode = fromPrevious.getStringExtra("PostalCode");
        Intent call = new Intent(Intent.ACTION_DIAL);
        call.setData(Uri.parse("tel:" + pCode));
    }
    Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);




}