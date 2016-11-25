package com.jordan.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public Button button0;
    public Button button1;
    public Button button2;
    public Button button3;
    public Button button4;
    public Button button5;
    public Button button6;
    public Button button7;
    public Button button8;
    public Button button9;
    public Button buttonPercent;
    public Button buttonPlusEMinus;
    public Button buttonAdd;
    public Button buttonSub;
    public Button buttonMul;
    public Button buttonDivision;
    public Button buttonC;
    public Button buttonEqual;

    public EditText edit1;
    public Float mValueOne;
    public Float mValueTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }

    private void findViews(){
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
        buttonAdd = (Button) findViewById(R.id.buttonPlus);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonDivision = (Button) findViewById(R.id.buttonDivide);
        buttonEqual = (Button) findViewById(R.id.buttonEqual);
        buttonMul = (Button) findViewById(R.id.buttonMultiply);
        buttonSub = (Button) findViewById(R.id.buttonMinus);
        buttonPlusEMinus = (Button) findViewById(R.id.buttonPlusEMinus);
        buttonPercent = (Button) findViewById(R.id.buttonPercent);
    }

    public void onClick(View view){
        Button button = (Button) view;
        Log.d("{DEBUG}" , button.getText().toString());


    }

}


