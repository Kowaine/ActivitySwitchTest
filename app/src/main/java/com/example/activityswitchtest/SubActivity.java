package com.example.activityswitchtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
    }

    public void onClick(View w)
    {
        Intent  intent = new Intent(SubActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
