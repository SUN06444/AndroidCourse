package com.example.admin.ch7_2_2_menu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public  boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int tmp;
        double result;
        EditText txtTemp = (EditText)findViewById(R.id.edt_value) ;
        TextView output = (TextView)findViewById(R.id.txv_result);
        tmp = Integer.parseInt(txtTemp.getText().toString());
        Button btn = (Button)findViewById(R.id.button);

        switch (item.getItemId()){
            case R.id.toF:
                result = (9.0 * tmp) / 5.0 + 32.0;
                output.setText("華氏溫度: " + result);
                break;
            case R.id.toC:
                result = (5.0 / 9.0) * (tmp - 32.0);
                output.setText("攝氏溫度: " + result);
                break;
            case R.id.subMenu:
                output.setText("子選單") ;
                break;
            case R.id.item01:
                output.setText("子項目 1") ;
                break;
            case R.id.item02:
                output.setText("子項目 2");
                break;
            case R.id.red:
                if (item.isChecked()){
                    item.setChecked(false);
                }else{
                    item.setChecked(true);
                }
                btn.setBackgroundColor(Color.RED);
                return true;
            case R.id.yellow:
                if (item.isChecked()){
                    item.setChecked(false);
                }else{
                    item.setChecked(true);
                }
                btn.setBackgroundColor(Color.YELLOW);
                return true;
            case R.id.green:
                if (item.isChecked()){
                    item.setChecked(false);
                }else{
                    item.setChecked(true);
                }
                btn.setBackgroundColor(Color.GREEN);
                return true;

        }
        return super.onOptionsItemSelected(item);
    }
}
