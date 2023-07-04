package com.example.convertunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView;
        EditText editText;
        Button button;

    textView = findViewById(R.id.result);
    editText = findViewById(R.id.editText);
    button   = findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             double kgConverted = Double.parseDouble(editText.getText().toString());
             textView.setText(""+convert(kgConverted)+" lb");
            }
        });

    }

    public double convert(double num){

        double pound = num * 2.205;

        return pound;
    }

}