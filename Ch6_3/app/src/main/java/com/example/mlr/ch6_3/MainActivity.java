package com.example.mlr.ch6_3;

import android.Manifest;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int num1, num2; //用private宣告num1、num2為整數變數(private私有成員只能在自身類別中使用)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //使用亂數取得數字
        num1 = (int) (Math.random()*12) + 1; //Math.random()*12的值為0~12，加1後為1~13
        num2 = (int) (Math.random()*12) + 1; //Math.random()*12的值為0~12，加1後為1~13
        Button btn1 = (Button) findViewById(R.id.btn1); //找到Button id為btn1
        btn1.setOnClickListener(btn1listener); //使用setOnClickListner()方法指定btn1的lisetener物件
        Button btn2 = (Button) findViewById(R.id.btn2); //找到Button id為btn2
        btn2.setOnClickListener(btn2listener); //使用setOnClickListner()方法指定btn2的lisetener物件
    }

    // button1 的 lisetener 物件
    View.OnClickListener btn1listener = new View.OnClickListener() { // 由 View.OnClickListener 類別建立 btn1listener 物件 -> 類別名稱 物件名稱 = new 類別名稱()
        @Override
        public void onClick(View view) { //宣告 onClick 方法， void為無傳回值
            Toast.makeText(MainActivity.this, Integer.toString(num1) , Toast.LENGTH_SHORT).show(); //當監聽到onClick方法時，會顯示一個彈跳訊息框
        }
    };

    // button2 的 lisetener 物件
    View.OnClickListener btn2listener = new View.OnClickListener() {  // 由 View.OnClickListener 類別建立 btn2listener 物件  -> 類別名稱 物件名稱 = new 類別名稱()
        @Override
        public void onClick(View view) { //宣告 onClick 方法， void為無傳回值
            Toast.makeText(MainActivity.this, Integer.toString(num2) , Toast.LENGTH_SHORT).show(); //當監聽到onClick方法時，會顯示一個彈跳訊息框
        }
    };
}
