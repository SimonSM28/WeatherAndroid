package com.simon.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView textCity;
    TextView textCityTemp;
    TextView textWind;
    TextView textPreasure;
    TextView textHumidity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textCity = findViewById(R.id.city_id);
        textCityTemp = findViewById(R.id.temperature_id);
        textWind = findViewById(R.id.wind_id);
        textPreasure = findViewById(R.id.preasure_id);
        textHumidity = findViewById(R.id.humidity_id);
        Intent intent = getIntent();
        String cityname = intent.getStringExtra("city");
        String temperature = intent.getStringExtra("temperature");
        String humidity = intent.getStringExtra("humidity");
        String wind = intent.getStringExtra("wind");
        String preasure = intent.getStringExtra("preasure");

        textCity.setText(cityname);
        textCityTemp.setText(temperature + " C");
        textWind.setText(wind);
        textPreasure.setText(preasure + " ml");
        textHumidity.setText(humidity + " %");
    }
}
