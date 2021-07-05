package com.example.mywebviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button buttonUCSD, buttonYahoo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonUCSD = (Button) findViewById(R.id.buttonUCSD);
        buttonUCSD.setOnClickListener(this);

        buttonYahoo = (Button)findViewById(R.id.buttonYahoo);
        buttonYahoo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.buttonUCSD:
                Intent u;
                u = new Intent(this,UcsdActivity.class);
                startActivity(u);
                break;
            case R.id.buttonYahoo:
                Intent y;
                y = new Intent(this,YahooActivity.class);
                startActivity(y);
                break;

        }

    }
}