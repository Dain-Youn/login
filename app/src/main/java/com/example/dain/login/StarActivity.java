package com.example.dain.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StarActivity extends AppCompatActivity {
    Button btn_before;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        btn_before = (Button)findViewById(R.id.btn_before);
        btn_before.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent = new Intent(StarActivity.this,MainActivity.class);
               startActivity(intent);
            }
        });
    }
}
