package com.example.a231forloop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    EditText edFrom, edTo;
    Button clickButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay=findViewById(R.id.tvDisplay);
        edFrom= findViewById(R.id.edFrom);
        edTo= findViewById(R.id.edTo);
        clickButton=findViewById(R.id.clickButton);

        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



// =========================== Condition Starts Here====================================
                tvDisplay.setText("");
              String firstValue = edFrom.getText().toString();
              String secondValue= edTo.getText().toString();


                    // Show Error when input is not given properly
              if (firstValue.length()>0 && secondValue.length()>0)  {

                  int initValue = Integer.parseInt(firstValue);
                  int targetValue = Integer.parseInt(secondValue);

                  for (int x=initValue; x<=targetValue; x++){

                      if (x%2==0) tvDisplay.append(" " +x);

                  }
              }

            else {
                    Toast.makeText(MainActivity.this, "Input a number please", Toast.LENGTH_SHORT).show();
                }





// ============================= Condition Finishes Here  ========================

            }







        });
    }
}