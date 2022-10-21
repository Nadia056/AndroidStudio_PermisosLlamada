package com.example.androidstudio_permisos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
     Button btn_call;
     String num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void call_onClick(View view)
    {
        String num="8715854676";
        Intent intent=new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:"+num));
        if(ActivityCompat.checkSelfPermission(this,Manifest.permission.CALL_PHONE)!=
                PackageManager.PERMISSION_GRANTED)
        {
           // TODO:Consider Calling
            return;
        }
        startActivity(intent);
    }
}