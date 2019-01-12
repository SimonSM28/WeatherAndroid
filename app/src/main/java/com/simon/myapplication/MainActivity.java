package com.simon.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CityesOnClickListener();
        //textView = findViewById(R.id.textView3);
        //textView.animate().scaleX(2f).scaleY(2f).setDuration(6000);
        //setContentView(new MyView(this));
        makeToast ("onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        makeToast ("onStart");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        makeToast ("onRestoreInstanceState(savedInstanceState");
    }

    @Override
    protected void onResume() {
        super.onResume();
        makeToast ("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        makeToast ("onPause");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        makeToast ("onSaveInstanceState");

    }

    @Override
    protected void onStop() {
        super.onStop();
        makeToast ("onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        makeToast ("onDestroy");
    }

    private void makeToast (String text) {
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }

    private void clickOnObject(TextView textView) {

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        };
        textView.setOnClickListener(listener);
    }
    private void CityesOnClickListener(){
        clickOnObject(textView = findViewById(R.id.moscow_city));
        clickOnObject(textView = findViewById(R.id.madrid_city));
        clickOnObject(textView = findViewById(R.id.porto_city));
        clickOnObject(textView = findViewById(R.id.new_york_city));
        clickOnObject(textView = findViewById(R.id.paris_city));
    }
}