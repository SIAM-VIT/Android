package com.example.hiandroiddeveloper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int age = 20;
        float price = 1.5f; //float,double
        double userScore = 1.5;
        long computerRam = 3454545454545454l;
        boolean isDead = true;
        String name = "Adhikansh Mittal";
        char letterA = 'A';


        //Sum of two integers
        int a = 10;
        int b = 100;
        int sum = a+b;
        Log.i("Sum of two numbers : ",sum+"");

        //operations
    }
    public void resDiv(View view){
        EditText number1 = (EditText)findViewById(R.id.editText);
        EditText number2 = (EditText)findViewById(R.id.editText2);

        int num1 = Integer.parseInt(number1.getText().toString());
        int num2 = Integer.parseInt(number2.getText().toString());

        float res = num1/num2;

        TextView result = (TextView)findViewById(R.id.textView3);
        result.setText(res+"");
    }


    public void resMul(View view){
        EditText number1 = (EditText)findViewById(R.id.editText);
        EditText number2 = (EditText)findViewById(R.id.editText2);

        int num1 = Integer.parseInt(number1.getText().toString());
        int num2 = Integer.parseInt(number2.getText().toString());

        int res = num1*num2;

        TextView result = (TextView)findViewById(R.id.textView3);
        result.setText(res+"");
    }
}
