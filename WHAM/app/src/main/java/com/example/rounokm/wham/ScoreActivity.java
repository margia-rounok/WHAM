package com.example.rounokm.wham;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        Intent intent = getIntent();
        String message = intent.getStringExtra("score");
        TextView textView = findViewById(R.id.Result);
        textView.setText(message);

    }

    public void replay (View view) {
        Intent intent = new Intent(this, LevelOneActivity.class);
        startActivity(intent);
    }

    public void main (View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}