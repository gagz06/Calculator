package com.example.gagan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,buttonAdd,buttonSub,buttonDivision,buttonMul,
            buttonEqual,buttonClear;
    float mValueOne,mValueTwo;
    EditText Edit;
    boolean gAddition, gSubtract,gMultiply,gDivision;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0=(Button) findViewById(R.id.button13);
        button1=(Button) findViewById(R.id.button);
        button2=(Button) findViewById(R.id.button2);
        button3=(Button) findViewById(R.id.button3);
        button4=(Button) findViewById(R.id.button5);
        button5=(Button) findViewById(R.id.button7);
        button6=(Button) findViewById(R.id.button8);
        button7=(Button) findViewById(R.id.button6);
        button8=(Button) findViewById(R.id.button9);
        button9=(Button) findViewById(R.id.button10);
        buttonAdd=(Button) findViewById(R.id.button14);
        buttonSub=(Button) findViewById(R.id.button15);
        buttonDivision=(Button) findViewById(R.id.button4);
        buttonMul=(Button) findViewById(R.id.button16);
        buttonEqual=(Button) findViewById(R.id.button12);
        buttonClear=(Button) findViewById(R.id.button11);
        Edit = (EditText) findViewById(R.id.textView);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Edit.setText(Edit.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Edit.setText(Edit.getText() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Edit.setText(Edit.getText() + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Edit.setText(Edit.getText() + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Edit.setText(Edit.getText() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Edit.setText(Edit.getText() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Edit.setText(Edit.getText() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Edit.setText(Edit.getText() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Edit.setText(Edit.getText() + "9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Edit.setText(Edit.getText() + "0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Edit == null)
                {
                    Edit.setText("");
                }
                else {
                    mValueOne = Float.parseFloat(Edit.getText() + "");
                    gAddition = true;
                    Edit.setText(null);
                }
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(Edit.getText() + "");
                gSubtract = true;
                Edit.setText(null);
            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(Edit.getText() + "");
                gMultiply = true;
                Edit.setText(null);
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(Edit.getText() + "");
                gDivision = true;
                Edit.setText(null);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(Edit.getText() + "");

                if (gAddition == true) {
                    Edit.setText(mValueOne + mValueTwo + "");
                    gAddition = false;
                }

                if (gSubtract == true) {
                    Edit.setText(mValueOne - mValueTwo + "");
                    gSubtract = false;
                }

                if (gMultiply == true) {
                    Edit.setText(mValueOne * mValueTwo + "");
                    gMultiply = false;
                }

                if (gDivision == true) {
                    Edit.setText(mValueOne / mValueTwo + "");
                    gDivision = false;
                }
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Edit.setText("");
            }
        });


    }
}

