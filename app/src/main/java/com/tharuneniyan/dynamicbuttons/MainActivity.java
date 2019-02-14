package com.tharuneniyan.dynamicbuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    Button button1, button2, button3;
    int[] inputArray = new int[] {1,2,3,4,5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);

        button1.setText("1");
        button2.setText("2");
        button3.setText("3");
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leftRotate(inputArray);
                buttonNameSet(inputArray);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leftRotate(inputArray);
                buttonNameSet(inputArray);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leftRotate(inputArray);
                buttonNameSet(inputArray);
            }
        });
    }

    private void leftRotate(int[] inputArray) {
        Toast.makeText(this, "Fill the sheets ma", Toast.LENGTH_SHORT).show();
        int temp;

            temp = inputArray[0];
            for (int j = 0; j < inputArray.length-1; j++){
                inputArray[j] = inputArray[j+1];
            }
            inputArray[inputArray.length - 1] = temp;

        Log.d(MainActivity.class.getSimpleName(),"inputArray"+Arrays.toString(inputArray));
    }

    private void buttonNameSet(int[] inputArray) {
        button1.setText(String.valueOf(inputArray[0]));
        button2.setText(String.valueOf(inputArray[1]));
        button3.setText(String.valueOf(inputArray[2]));
    }
}

