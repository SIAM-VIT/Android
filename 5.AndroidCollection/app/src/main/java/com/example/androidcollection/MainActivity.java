package com.example.androidcollection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        int i;
        int[] numberArray = {5,10,15,20,25};
        int firstNumberOfArray = numberArray[0];
        int lastNumberOfArray = numberArray[numberArray.length - 1];

        for(i=0;i<numberArray.length;i++){
            Log.i("Number is",numberArray[i]+"");
        }
        Log.i("Last Element",lastNumberOfArray + "");

        int j = 5;
        int[] numArray = new int[5];
        for(i=0;i<numArray.length;i++)
        {
            numArray[i] = j;
            j = j*5;
        }

        for(i=0;i<numArray.length;i++)
        {
            Log.i("Number is",numArray[i]+"");
        }


        //The Address of the array to the console
        Log.i("The Address of array",numArray+"");
    }
}
