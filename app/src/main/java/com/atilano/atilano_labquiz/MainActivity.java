package com.atilano.atilano_labquiz;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    SharedPreferences preferences;
    EditText etAuthor, etQuote;

    Button btnSave, btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preferences = getSharedPreferences("sharedText", MODE_PRIVATE);
        etAuthor = (EditText) findViewById(R.id.etAuthor);
        etQuote = (EditText) findViewById(R.id.etQuote);
        btnSave = (Button) findViewById(R.id.btnSave);
        btnNext = (Button) findViewById(R.id.btnNext);
    }

    public void Save (View view){
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("Author",etAuthor.getText().toString());
        editor.putString("Quote",etQuote.getText().toString());
        editor.commit();

        Toast.makeText(this, "Successfully saved!", Toast.LENGTH_SHORT).show();
    }

    public void Next (View view){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }


}
