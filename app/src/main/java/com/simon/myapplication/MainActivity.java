package com.simon.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    City moscow = new City("Moscow", -15, "South", 45, 490);
    City madrid = new City("Madrid", 35, "North", 10, 126);
    City porto = new City("Porto", 25, "West", 35, 340);
    City newyork = new City("New York", -2, "North-West", 50, 980);
    City paris = new City("Paris", 15, "South", 30, 540);

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(new MyView(this));
        makeToast ("onCreate");
        CheckBox windCheck = findViewById(R.id.wind_check);
        TextView textView1 = findViewById(R.id.moscow_city);
        TextView textView2 = findViewById(R.id.madrid_city);
        TextView textView3 = findViewById(R.id.porto_city);
        TextView textView4 = findViewById(R.id.new_york_city);
        TextView textView5 = findViewById(R.id.paris_city);
        textView1.setOnClickListener(this);
        textView2.setOnClickListener(this);
        textView3.setOnClickListener(this);
        textView4.setOnClickListener(this);
        textView5.setOnClickListener(this);
        windCheck.setOnClickListener(this);

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

    @Override
    public void onClick(View v) {
        Intent i = new Intent(MainActivity.this, Main2Activity.class);
        switch (v.getId()) {
            case R.id.moscow_city:
                putCityWeatherInfo(moscow.getName(), moscow.getTemperature(), moscow.getWind(),
                        moscow.getHumidity(), moscow.getPreasure(), i);
                break;
            case R.id.madrid_city:
                putCityWeatherInfo(madrid.getName(), madrid.getTemperature(), madrid.getWind(),
                        madrid.getHumidity(), madrid.getPreasure(), i);
                break;
            case R.id.porto_city:
                putCityWeatherInfo(porto.getName(), porto.getTemperature(), porto.getWind(),
                        porto.getHumidity(), porto.getPreasure(), i);
                break;
            case R.id.new_york_city:
                putCityWeatherInfo(newyork.getName(), newyork.getTemperature(), newyork.getWind(),
                        newyork.getHumidity(), newyork.getPreasure(), i);
                break;
            case R.id.paris_city:
                putCityWeatherInfo(paris.getName(), paris.getTemperature(), paris.getWind(),
                        paris.getHumidity(), paris.getPreasure(), i);
                break;
        }
    }



    public void putCityWeatherInfo (String name, int temp, String wind, int humid, int preasure, Intent i) {
        i.putExtra("city", name);
        i.putExtra("temperature", Integer.toString(temp));
        i.putExtra("wind", wind);
        i.putExtra("humidity", Integer.toString(humid));
        i.putExtra("preasure", Integer.toString(preasure));
        startActivity(i);
    }
}