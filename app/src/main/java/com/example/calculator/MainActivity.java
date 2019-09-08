package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText number1;
    EditText number2;
    Button add, substract, divide, multiply;

    float res;
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView)findViewById(R.id.result);

        number1 = (EditText)findViewById(R.id.number1);
        number2 = (EditText)findViewById(R.id.number2);

        add = (Button)findViewById(R.id.add);
        substract = (Button)findViewById(R.id.substract);
        divide = (Button)findViewById(R.id.divide);
        multiply = (Button)findViewById(R.id.multiply);


        add.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                num1 = Integer.parseInt(number1.getText().toString());
                num2 = Integer.parseInt(number2.getText().toString());

                res = num1 + num2 ;

                result.setText(String.valueOf(res));
            }

        });

        substract.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                num1 = Integer.parseInt(number1.getText().toString());
                num2 = Integer.parseInt(number2.getText().toString());

                res = num1 - num2 ;

                result.setText(String.valueOf(res));
            }

        });

        multiply.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                num1 = Integer.parseInt(number1.getText().toString());
                num2 = Integer.parseInt(number2.getText().toString());

                res = num1 * num2 ;

                result.setText(String.valueOf(res));
            }

        });

        divide.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                num1 = Integer.parseInt(number1.getText().toString());
                num2 = Integer.parseInt(number2.getText().toString());

                res = num1 / num2 ;

                result.setText(String.valueOf(res));
            }

        });

    }
}
