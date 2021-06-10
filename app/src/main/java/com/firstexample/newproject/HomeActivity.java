package com.firstexample.newproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    Button button,button1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        button=(Button)findViewById(R.id.button_parse);
        button1=(Button)findViewById(R.id.button_loc);


    }


    public void BtnParse(View view) {
        Intent intent=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
    }

    public void location(View view) {
        Intent intent=new Intent(getApplicationContext(),MapsActivity.class);
        startActivity(intent);
    }
}
