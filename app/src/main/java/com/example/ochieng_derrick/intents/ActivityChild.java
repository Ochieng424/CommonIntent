package com.example.ochieng_derrick.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityChild extends AppCompatActivity {
    private TextView mDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        mDisplay = findViewById(R.id.tv_display);

        Intent intentThatStartedThisActivity = getIntent();

        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)){
            String message = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEXT);

            mDisplay.setText(message);
        }
    }
}
