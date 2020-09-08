package com.luongthuan.setupsdk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.luongthuan.test_sdk.SdkActivity;
import com.luongthuan.test_sdk.ToasterMess;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToasterMess.s(MainActivity.this, "Đợi 3s");
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this, SdkActivity.class));
            }
        }, 3000);

    }
}