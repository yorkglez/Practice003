package com.tecmm.tala.practice003;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText varTxtNum1;
    EditText varTxtNum2;
    TextView txtResult;
    Button btnOperation;
    RadioButton varRSum;
    RadioButton varRRes;
    RadioButton varRMult;
    RadioButton varRDiv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        varTxtNum1 = (EditText) findViewById(R.id.txtNum1);
        varTxtNum2 = (EditText) findViewById(R.id.txtNum2);
        txtResult = (TextView) findViewById(R.id.txtResult);
        btnOperation = (Button) findViewById(R.id.btnOperation);
        varRSum = (RadioButton) findViewById(R.id.radioSum);
        varRRes= (RadioButton) findViewById(R.id.radioRes);
        varRDiv = (RadioButton) findViewById(R.id.radioDiv);
        varRMult = (RadioButton) findViewById(R.id.radioMult);
        btnOperation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(varTxtNum1.getText().toString());
                int num2 = Integer.parseInt(varTxtNum2.getText().toString());
                int result = 0;
                if(varRSum.isChecked()){
                    result = num1 + num2;
                    txtResult.setText("El resultado es: " +result);
                }
                if(varRRes.isChecked()){
                    result = num1 - num2;
                    txtResult.setText("El resultado es: " +result);
                }
                if(varRMult.isChecked()){
                    result = num1 * num2;
                    txtResult.setText("El resultado es: " +result);
                }
                if(varRDiv.isChecked()){
                    result = num1 / num2;
                    txtResult.setText("El resultado es: " +result);
                }

            }
        });
    }

}
