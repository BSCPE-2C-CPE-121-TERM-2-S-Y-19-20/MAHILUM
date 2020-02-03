package com.example.insertionsort;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    int arraySize = 0;
    int[] arrayNum = new int[99];
    int temp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sortBtn = (Button) findViewById(R.id.sortButton);
        Button nextBtn = (Button) findViewById(R.id.nextbutton);

            nextBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    TextView result = (TextView) findViewById(R.id.resultTextView);
                    EditText inputNum = (EditText) findViewById(R.id.inputNumText);


                    arrayNum[arraySize] = Integer.parseInt(inputNum.getText().toString());
                    inputNum.setText(" ");

                    result.setText(arrayNum[arraySize]  + "");
                    arraySize++;

                }
            }
            );





    }
}
