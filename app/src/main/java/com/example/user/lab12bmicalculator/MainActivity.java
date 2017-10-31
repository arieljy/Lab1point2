package com.example.user.lab12bmicalculator;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextWeight, editTextHeight;
    private TextView textViewResult;
    private ImageView imageViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextHeight = (EditText) findViewById(R.id.editTextHeight);
        editTextWeight= (EditText) findViewById(R.id.editTextWeight);
        textViewResult = (TextView) findViewById(R.id.textViewResult);
        imageViewResult = (ImageView) findViewById(R.id.imageViewResult);
    }

    public void calculate(View view)
    {
        double weight, height, result;
        weight = Double.parseDouble(editTextWeight.getText().toString());
        height = Double.parseDouble(editTextHeight.getText().toString());

        result = weight / (height * height);

        if(result<=18.5) {
            textViewResult.setText("Under Weight");
            imageViewResult.setImageResource(R.drawable.under);
        }
        else if(result >= 21)
        {
            textViewResult.setText("Over Weight");
            imageViewResult.setImageResource(R.drawable.over);
        }
        else
        {
            textViewResult.setText("Normal");
            imageViewResult.setImageResource(R.drawable.normal);
        }



    }

    public void reset(View view)
    {
        editTextHeight.setText("");
        editTextWeight.setText("");
        textViewResult.setText("BMI");
        imageViewResult.setImageResource(R.drawable.empty);
    }
}
