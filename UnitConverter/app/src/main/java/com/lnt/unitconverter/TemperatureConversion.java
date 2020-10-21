package com.lnt.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TemperatureConversion extends AppCompatActivity {

    Button convert;
    EditText input;
    float mValueOne;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature_conversion);

        convert= (Button) findViewById(R.id.convert);
        input = (EditText) findViewById(R.id.input);
        output = (TextView) findViewById(R.id.output);
    }

    public void convert(View view){
        try {
            mValueOne = Float.parseFloat(input.getText().toString());
            float temp = (mValueOne * 9 / 5) + 32;
            output.setText(Float.toString(temp));
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }


}