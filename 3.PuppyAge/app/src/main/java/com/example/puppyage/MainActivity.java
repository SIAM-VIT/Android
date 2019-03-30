package com.example.puppyage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
    }

//    public void changeImg(View viewChange){
//        ImageView img1 = (ImageView)findViewById(R.id.image1);
//        img1.setImageResource(R.drawable.lighthouse);
//    }

    public void calAge(View view){
        EditText year = (EditText)findViewById(R.id.year);
        int yearOfBorn = Integer.parseInt(year.getText().toString());
        Log.i("Year",year.getText() + "");
        int age = Calendar.getInstance().get(Calendar.YEAR) - yearOfBorn;
        Toast.makeText(getApplicationContext(),"Age is"+age,Toast.LENGTH_SHORT);
        Log.i("Age",age + "");

        TextView showAge = (TextView)findViewById(R.id.age);
        showAge.setText(age+"");
    }

}
