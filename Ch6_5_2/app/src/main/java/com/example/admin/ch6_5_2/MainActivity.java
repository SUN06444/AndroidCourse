package com.example.admin.ch6_5_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radioGroup;
    private TextView output;
    private RadioButton rdb01,rdb02,rdb03,rdb04;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = (RadioGroup)findViewById(R.id.radioGroup);
        output = (TextView)findViewById(R.id.txv_output);
        rdb01 = (RadioButton)findViewById(R.id.rdbRare);
        rdb02 = (RadioButton)findViewById(R.id.rdbMedium);
        rdb03 = (RadioButton)findViewById(R.id.rdbMedWell);
        rdb04 = (RadioButton)findViewById(R.id.rdbWellDone);

        radioGroup.setOnCheckedChangeListener(listener);
    }
    private RadioGroup.OnCheckedChangeListener listener = new RadioGroup.OnCheckedChangeListener(){
        public void onCheckedChanged(RadioGroup group, int checkId){
            if(checkId == rdb01.getId()){
                output.setText(rdb01.getText());
            }else if (checkId == rdb02.getId()) {
                output.setText(rdb02.getText());
            }else if (checkId == rdb03.getId()) {
                output.setText(rdb03.getText());
            }else if (checkId == rdb04.getId()) {
                output.setText(rdb04.getText());
            }
        }
    };
}
