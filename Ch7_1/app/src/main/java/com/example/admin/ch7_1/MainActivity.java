package com.example.admin.ch7_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener {
    private TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output = (TextView)findViewById(R.id.output);
        Button btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(this);
        btn.setOnLongClickListener(this);
    }

    public void onClick(View v){
        output.setText("觸發 Click事件...");
    }

    public boolean onLongClick(View v) {
        output.setText("觸發LongClick事件...");
        return false;
    }
}
