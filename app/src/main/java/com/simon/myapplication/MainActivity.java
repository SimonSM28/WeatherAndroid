package com.simon.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(new MyView(this));
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
}
