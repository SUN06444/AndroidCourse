package com.example.admin.ch8_2;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
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

        Button btn_message = (Button)findViewById(R.id.btn_message);
        btn_message.setOnClickListener(btn_message_listener);

        Button btn_confirm = (Button)findViewById(R.id.btn_confirm);
        btn_confirm.setOnClickListener(btn_confirm_listener);

        Button btn_single = (Button)findViewById(R.id.btn_single);
        btn_single.setOnClickListener(btn_single_listener);


    }

    DialogInterface.OnClickListener dialog_listener = new DialogInterface.OnClickListener(){
        public void onClick(DialogInterface dialogInterface, int i){

        }
    };

    View.OnClickListener btn_message_listener = new View.OnClickListener(){
        public void onClick(View v){
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

            builder.setTitle("關於")
                    .setMessage("版本:7.0版 \n 作者:陳會安")
                    .setPositiveButton("確定",dialog_listener)
                    .show();
        }
    };

    DialogInterface.OnClickListener dialog_Ok = new DialogInterface.OnClickListener(){
        public void onClick(DialogInterface dialogInterface, int i){
            finish();
        }
    };

    DialogInterface.OnClickListener dialog_Cancel = new DialogInterface.OnClickListener(){
        public void onClick(DialogInterface dialogInterface, int i){
            Toast.makeText(MainActivity.this, "按下取消按鈕" , Toast.LENGTH_SHORT).show();
        }
    };

    View.OnClickListener btn_confirm_listener = new View.OnClickListener(){
        public void onClick(View v){
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("確認")
                    .setMessage("確認結束本程式")
                    .setPositiveButton("確定", dialog_Ok)
                    .setNegativeButton("取消", dialog_Cancel)
                    .show();
        }
    };

    DialogInterface.OnClickListener dialog_single_option = new DialogInterface.OnClickListener(){
        public void onClick(DialogInterface dialogInterface, int i){
            Button btn_single = (Button)findViewById(R.id.btn_single);
            switch (i){
                case 0:
                    btn_single.setBackgroundColor(Color.RED);
                    break;
                case 1:
                    btn_single.setBackgroundColor(Color.YELLOW);
                    break;
                case 2:
                    btn_single.setBackgroundColor(Color.GREEN);
                    break;
            }
        }
    };

    View.OnClickListener btn_single_listener = new View.OnClickListener(){
        public void onClick(View v){
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            String[] singleOptions = { "紅色", "黃色", "綠色" };
            builder.setTitle("請選擇一個顏色")
                    .setItems(singleOptions,dialog_single_option)
                    .setNegativeButton("取消", null)
                    .create()
                    .show();
        }
    };

    /*非動態綁定
    public void button_Click(View v){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("關於")
                .setMessage("版本:7.0版 \n 作者:陳會安")
                .setPositiveButton(
                        "確定"
                        , new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){

                            }
                        })
                .show();
    }
    */
}
