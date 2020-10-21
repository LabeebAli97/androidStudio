package com.lnt.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Temperature1 extends AppCompatActivity {

    Button convert1;
    EditText input2;
    float mValueTwo;
    TextView output2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature1);

        convert1= (Button) findViewById(R.id.convert1);
        input2 = (EditText) findViewById(R.id.input2);
        output2 = (TextView) findViewById(R.id.output2);
    }

    public void convert1(View view){
        try {
            mValueTwo = Float.parseFloat(input2.getText().toString());
            float temp = (mValueTwo - 32) * 5/9;
            output2.setText(Float.toString(temp));
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}