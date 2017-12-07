package com.atilano.atilano_labquiz;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    SharedPreferences preferences;

    TextView tvName, tvParagraph;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvName = (TextView) findViewById(R.id.tvName);
        tvParagraph = (TextView) findViewById(R.id.tvParagraph);

        preferences = getSharedPreferences("sharedText", MODE_PRIVATE);

        String author = preferences.getString("Author", "");
        String quote = preferences.getString("Quote", "");

        tvName.setText(author + " said: ");
        tvParagraph.setText("''" + quote + "''");
    }

    public void Back (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
