package com.example.admin.ch6_5_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(listner);

    }
    View.OnClickListener listner = new View.OnClickListener(){
      public void onClick(View v){
          int amount = 0, quantity = 1;

          EditText txtQuantity = (EditText)findViewById(R.id.txtQuantity);
          CheckBox original = (CheckBox)findViewById(R.id.chkOriginal);
          CheckBox beef =  (CheckBox)findViewById(R.id.chkBeef);
          CheckBox seaFood =  (CheckBox)findViewById(R.id.chkSeaFood);
          TextView output = (TextView)findViewById(R.id.lblOutput);

          quantity = Integer.parseInt(txtQuantity.getText().toString());

          if(original.isChecked()){
              amount += 250 * quantity;
          }
          if(beef.isChecked()){
              amount += 275 * quantity;
          }
          if(seaFood.isChecked()){
              amount += 350 * quantity;
          }
          output.setText(Integer.toString(amount));

      }
    };
}
