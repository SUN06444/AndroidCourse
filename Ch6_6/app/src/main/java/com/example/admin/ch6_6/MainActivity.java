package com.example.admin.ch6_6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    private ImageView image;
    private RadioGroup radioGroup;
    private RadioButton rdb01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        radioGroup = (RadioGroup)findViewById(R.id.radioGroup);
        rdb01 = (RadioButton)findViewById(R.id.rdb_dog);
        image = (ImageView)findViewById(R.id.img_result);

        radioGroup.setOnCheckedChangeListener(listener);

    }

    private RadioGroup.OnCheckedChangeListener listener = new RadioGroup.OnCheckedChangeListener(){
      public void onCheckedChanged(RadioGroup group,int checkedId){
        if(checkedId == rdb01.getId())
            image.setImageResource(R.drawable.dog);
        else
            image.setImageResource(R.drawable.elephant);
      }
    };
}
