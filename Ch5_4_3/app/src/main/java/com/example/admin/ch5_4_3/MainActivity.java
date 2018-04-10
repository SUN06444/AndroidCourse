package com.example.admin.ch5_4_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //點擊btn2
    public void btn2_click(View view){
        String btn2Text = ((Button)view).getText().toString(); //取得btn2的text並轉為字串
        Toast.makeText(this, btn2Text, Toast.LENGTH_LONG).show(); //點擊後顯示出提示訊息
        ((Button)view).setText("change btn2 text"); //改變btn2的text

        //點擊後，也改變btn1的text
        Button btn = (Button)findViewById(R.id.button1); // 取得btn的id
        btn.setText("change btn1 text"); //改變btn1的text

    }
}
