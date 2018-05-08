package com.example.admin.ch7_5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    FirstFragment First = new FirstFragment();
    SecondFragment Second = new SecondFragment();
    SecondFragment arg = new SecondFragment().newInstance("改為自帶參數片段");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.frame, First).commit();
    }

    public void btn_replace(View v){
        getSupportFragmentManager().beginTransaction().replace(R.id.frame, Second).commit();
    }

    public void btn_delete(View v){
        getSupportFragmentManager().beginTransaction().remove(Second).commit();
    }

    public void btn(View v){
        getSupportFragmentManager().beginTransaction().replace(R.id.frame, arg).commit();
    }
}
