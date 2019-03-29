package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
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

    public void calculate(View buttonView){

        EditText value1 = (EditText)findViewById(R.id.num1);
        EditText value2 = (EditText)findViewById(R.id.num2);
        int n1 = 0;
        int n2 = 0;
        String num1 = value1.getText().toString();
        String num2 = value2.getText().toString();
        n1 = Integer.parseInt(num1);
        n2 = Integer.parseInt(num2);

        int result = n1 + n2;
        Log.i("Operations",result + "");

        TextView Operation = (TextView)findViewById(R.id.res);
        Operation.setText(result + "");
    }
    public void clearText(View buttonView){
        TextView Operation = (TextView)findViewById(R.id.res);
        Operation.setText("");
    }
}
