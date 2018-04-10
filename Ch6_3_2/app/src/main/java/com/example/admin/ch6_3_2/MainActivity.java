package com.example.admin.ch6_3_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton imgBtn1,imgBtn2,imgBtn3; //宣告imagebutton變數
    private int num1,num2,num3;
    private int[] pp = new int[4];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (int) (Math.random()*3); //0,1,2,3
        num2 = (int) (Math.random()*3); //0,1,2,3
        num3 = (int) (Math.random()*3); //0,1,2,3

        //如果先從第一張牌點擊
        if(num1 == 0 | num1 == 3){
            num2 = (int) (Math.random()*1) + 1; // pp[1] , pp[2]
            num3 = (int) (Math.random()*1) + 1; // pp[1] , pp[2]
            if(num2 == 1){ //點第2張牌
                num3 = 2;
            }else if (num3 == 1){
                num2=1;
            }else if (num2 == 2){
                num3 = 1;
            }else if (num3 == 2){
                num2 = 1;
            }
        }else if(num1==1){
            num2 =  (int) (Math.random()*1) + 2; //pp[2],pp[3]
            num3 =  (int) (Math.random()*1) + 2; //pp[2],pp[3]
            if(num2 == 2){
                num3 = 3;
            }else if (num3 == 2){
                num2=3;
            }else if (num2 == 3){
                num3=2;
            }else if (num3 == 3){
                num2=2;
            }
        }else if(num1==2){
            num2 =  (int) (Math.random()*1) ; //pp[0],pp[1]
            num3 =  (int) (Math.random()*1) ; //pp[0],pp[1]
            if(num2 == 0){
                num3 = 1;
            }else if (num3 == 0){
                num2 = 1;
            }else if (num2 == 1){
                num3 = 0;
            }else if (num3 == 1){
                num2 = 0;
            }
        }

        //如果先從第二張牌點擊
        if(num2 == 0 | num2 == 3){
            num1 = (int) (Math.random()*1) + 1; // pp[1] , pp[2]
            num3 = (int) (Math.random()*1) + 1; // pp[1] , pp[2]
            if(num1 == 1){ //點第2張牌
                num3 = 2;
            }else if (num3 == 1){
                num1=1;
            }else if (num1 == 2){
                num3 = 1;
            }else if (num3 == 2){
                num1 = 1;
            }
        }else if(num2==1){
            num1 =  (int) (Math.random()*1) + 2; //pp[2],pp[3]
            num3 =  (int) (Math.random()*1) + 2; //pp[2],pp[3]
            if(num1 == 2){
                num3 = 3;
            }else if (num3 == 2){
                num1=3;
            }else if (num1 == 3){
                num3=2;
            }else if (num3 == 3){
                num1=2;
            }
        }else if(num2==2){
            num1 =  (int) (Math.random()*1) ; //pp[0],pp[1]
            num3 =  (int) (Math.random()*1) ; //pp[0],pp[1]
            if(num1 == 0){
                num3 = 1;
            }else if (num3 == 0){
                num1 = 1;
            }else if (num1 == 1){
                num3 = 0;
            }else if (num3 == 1){
                num1 = 0;
            }
        }

        //若從第三張牌開始抽
        if(num3 == 0 | num3 == 3){
            num2 = (int) (Math.random()*1) + 1; // pp[1] , pp[2]
            num1 = (int) (Math.random()*1) + 1; // pp[1] , pp[2]
            if(num2 == 1){ //點第2張牌
                num1 = 2;
            }else if (num1 == 1){
                num2=1;
            }else if (num2 == 2){
                num1 = 1;
            }else if (num1 == 2){
                num2 = 1;
            }
        }else if(num3 == 1){
            num2 =  (int) (Math.random()*1) + 2; //pp[2],pp[3]
            num1 =  (int) (Math.random()*1) + 2; //pp[2],pp[3]
            if(num2 == 2){
                num1 = 3;
            }else if (num1 == 2){
                num2=3;
            }else if (num2 == 3){
                num1=2;
            }else if (num1 == 3){
                num2=2;
            }
        }else if(num3==2){
            num2 =  (int) (Math.random()*1) ; //pp[0],pp[1]
            num1 =  (int) (Math.random()*1) ; //pp[0],pp[1]
            if(num2 == 0){
                num1 = 1;
            }else if (num1 == 0){
                num2 = 1;
            }else if (num2 == 1){
                num1 = 0;
            }else if (num1 == 1){
                num2 = 0;
            }
        }

        pp[0] = R.drawable.d13; //人頭
        pp[1] = R.drawable.d8;
        pp[2] = R.drawable.h7;
        pp[3] = R.drawable.h11; //人頭

        // Step1
        imgBtn1 = (ImageButton)findViewById(R.id.imgBtn1); //找到ImageButton id為imgBtn1
        imgBtn2 = (ImageButton)findViewById(R.id.imgBtn2); //找到ImageButton id為imgBtn2
        imgBtn3 = (ImageButton)findViewById(R.id.imgBtn3); //找到ImageButton id為imgBtn3




        //Step2 建立OnClick的監聽事件
        imgBtn1.setOnClickListener(
                new View.OnClickListener(){ //匿名物件(沒有名稱)
                    public void onClick(View v){
                        imgBtn1.setImageResource(pp[num1]);
                    }
                }
        );

        imgBtn2.setOnClickListener(
                new View.OnClickListener(){ //匿名物件(沒有名稱)
                    public void onClick(View v){
                        imgBtn2.setImageResource(pp[num2]);
                    }
                }
        );

        imgBtn3.setOnClickListener(
                new View.OnClickListener(){ //匿名物件(沒有名稱)
                    public void onClick(View v){
                        imgBtn3.setImageResource(pp[num3]);
                    }
                }
        );
    }
}
