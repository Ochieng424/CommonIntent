package com.example.ochieng_derrick.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityParent extends AppCompatActivity {
    private EditText tv_Message;
    private Button btnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent);

        tv_Message = findViewById(R.id.tv_Message);
        btnClick = findViewById(R.id.btnClick);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = tv_Message.getText().toString();

                Intent startActivityChildIntent = new Intent(ActivityParent.this, ActivityChild.class);
                startActivityChildIntent.putExtra(Intent.EXTRA_TEXT, message);
                startActivity(startActivityChildIntent);
            }
        });
    }
}
