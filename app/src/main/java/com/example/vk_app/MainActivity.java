package com.example.vk_app;

import android.annotation.SuppressLint;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickOpenWebpageButton(View view){
        openWebPage("https://www.google.com");
    }
    public void onClickOpenMapButton(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        Uri addressUri = Uri.parse("geo:0,0")
                .buildUpon().appendQueryParameter("q","Тверская улица, 1")
                .build();
        intent.setData(addressUri);
        if(intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);
        }
    }

    private void openWebPage(String url){
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if(intent.resolveActivity(getPackageManager())!=null){
            startActivity(intent);
        }
    }
}