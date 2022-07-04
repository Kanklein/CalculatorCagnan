package com.example.calculatorcagnan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public int prev_num = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        digitButtonListenerMethod();
        operationButtonListenerMethod();
    }
    public void digitButtonListenerMethod(){
        View.OnClickListener digitListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText etSpace = (EditText) findViewById(R.id.etSpace);
                Button btn = (Button) view;
                etSpace.setText(etSpace.getText() + "" + btn.getText());
            }
        };
        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);
        Button btn3 = (Button) findViewById(R.id.btn3);
        Button btn4 = (Button) findViewById(R.id.btn4);
        Button btn5 = (Button) findViewById(R.id.btn5);
        Button btn6 = (Button) findViewById(R.id.btn6);
        Button btn7 = (Button) findViewById(R.id.btn7);
        Button btn8 = (Button) findViewById(R.id.btn8);
        Button btn9 = (Button) findViewById(R.id.btn9);
        btn1.setOnClickListener(digitListener);
        btn2.setOnClickListener(digitListener);
        btn3.setOnClickListener(digitListener);
        btn4.setOnClickListener(digitListener);
        btn5.setOnClickListener(digitListener);
        btn6.setOnClickListener(digitListener);
        btn7.setOnClickListener(digitListener);
        btn8.setOnClickListener(digitListener);
        btn9.setOnClickListener(digitListener);
    }
    public void operationButtonListenerMethod(){
        View.OnClickListener opListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText etSpace = (EditText)  findViewById(R.id.etSpace);
                Button btn = (Button) view;
                String op = btn.getText().toString();
                String str_number = etSpace.getText().toString();
                int num = Integer.parseInt(str_number);
                if(op.compareTo("+") == 0){
                    //TODO
                    int res = prev_num + num;
                    prev_num = res;
                    etSpace.setText((res + ""));
                }
                    //etSpace.setText("0");
            }
        };
        Button btnPlus = (Button) findViewById(R.id.btnPlus);
        btnPlus.setOnClickListener(opListener);
    }
}