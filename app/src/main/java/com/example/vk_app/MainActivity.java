package com.example.vk_app;

import android.annotation.SuppressLint;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    private EditText textEntry;
    private Button changeActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeActivityButton = findViewById(R.id.change_activity);
        textEntry = findViewById(R.id.et_text_entry);

        changeActivityButton.setOnClickListener(view -> {
            String textEntered = textEntry.getText().toString();
            Context context = MainActivity.this;

            Class destinationActivity = ChildActivity.class;
            Intent childActivityIntent = new Intent(context, destinationActivity);
            childActivityIntent.putExtra(Intent.EXTRA_TEXT, textEntered);
            startActivity(childActivityIntent);
        });
    }
}