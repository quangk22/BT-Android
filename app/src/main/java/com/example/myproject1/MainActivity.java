package com.example.myproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button0;
    Button buttonCong;
    Button buttonTru;
    Button buttonX;
    Button buttonChia;
    Button buttonBang;
    TextView input1, input2, clear, c ;
    int num1, num2;
    String operator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

         button0 = (Button) findViewById(R.id.button0);
         button1 = (Button) findViewById(R.id.button1);
         button2 = (Button) findViewById(R.id.button2);
         button3 = (Button) findViewById(R.id.button3);
         button4 = (Button) findViewById(R.id.button4);
         button5 = (Button) findViewById(R.id.button5);
         button6 = (Button) findViewById(R.id.button6);
         button7 = (Button) findViewById(R.id.button7);
         button8 = (Button) findViewById(R.id.button8);
         button9 = (Button) findViewById(R.id.button9);
         input1 = (TextView) findViewById(R.id.input1);
        input2 = (TextView) findViewById(R.id.input2);
        clear = (TextView) findViewById(R.id.clear);
        c = (Button) findViewById(R.id.c);
        buttonCong = (Button) findViewById(R.id.buttonCong);
        buttonTru = (Button) findViewById(R.id.buttonTru);
        buttonX = (Button) findViewById(R.id.buttonX);
        buttonChia = (Button) findViewById(R.id.buttonChia);
        buttonBang = (Button) findViewById(R.id.buttonBang);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input1.append("0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input1.append("1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input1.append("2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input1.append("3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input1.append("4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input1.append("5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input1.append("6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input1.append("7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input1.append("8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input1.append("9");
            }
        });



        buttonCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(input1.getText().toString());
                operator = "+";
                input2.setText(num1 + " + ");
                input1.setText("");
            }
        });
        buttonTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(input1.getText().toString());
                operator = "-";
                input2.setText(num1 + " - ");
                input1.setText("");
            }
        });
        buttonX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(input1.getText().toString());
                operator = "*";
                input2.setText(num1 + " * ");
                input1.setText("");
            }
        });
        buttonChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(input1.getText().toString());
                operator = "/";
                input2.setText(num1 + " / ");
                input1.setText("");
            }
        });
        buttonBang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    num2 = Integer.parseInt(input1.getText().toString());
                int result;

                        switch (operator){
                            case "+":
                                result = num1 + num2;
                                input1.setText(String.valueOf(result));
                                input2.setText(num1 +" + " +num2 + " = ");
                                break;
                            case "-":
                                result = num1 -num2;
                                input1.setText(String.valueOf(result));
                                input2.setText(num1 +" - " +num2 + " = ");
                                break;
                            case "*":
                                result = num1 * num2;
                                input1.setText(String.valueOf(result));
                                input2.setText(num1 +" * " +num2 + " = ");
                                break;
                            case "/":
                                result = num1 / num2;
                                input1.setText(String.valueOf(result));
                                input2.setText(num1 +" / " +num2 + " = ");
                                break;
                        }


                }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input1.setText("");
                input2.setText("");
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}