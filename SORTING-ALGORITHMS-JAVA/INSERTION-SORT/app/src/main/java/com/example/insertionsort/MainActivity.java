package com.example.insertionsort;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;
import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    int arraySize = 0;
    int[] arrayNum = new int[20];
    int temp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button sortBtn = (Button) findViewById(R.id.sortButton);
        Button nextBtn = (Button) findViewById(R.id.nextbutton);



        nextBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    TextView result = (TextView) findViewById(R.id.resultTextView);
                    EditText inputNum = (EditText) findViewById(R.id.inputNumText);   // GIKUHA ANG STRING GIKAN SA EditText
                    String[] array = inputNum.getText().toString().trim().split(","); /*for a user input of 1,2,3,4 split will return a string array = {"1","2","3","4"} */
                    // result.setText(array[1]+"");

                    int i;
                    int[] myInts = new int[20];   // GIHIMONG INTEGER ANG VALUES
                    for ( i=0; i < array.length; i++) {
                        myInts[i] = Integer.parseInt(array[i]);
                    }

                    int[] myInts_sort = new int[20];
                    MainActivity ob = new MainActivity();

                    //myInts_sort = ob.selection_sort(myInts);
                    myInts_sort = ob.insertion_sort(myInts);

                    String result1 = Arrays.toString(myInts_sort);

                    result.setText(result1+"");


                }
            }
            );
    }

    int [] insertion_sort(int[] arr)
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    int [] selection_sort(int[] arr)
    {
        int n = arr.length;
        int i,j,temp;
        for (i=0;i<=n;i++){
            for (j=i+1;j<=n;j++){
                if (arr[j]<arr[i]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

}
