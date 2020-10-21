package com.lnt.unitconverter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button temp, temp1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        temp = (Button) findViewById(R.id.button9);
        temp1 = (Button) findViewById(R.id.button10);

    }

    public void moveToTemperatureConversionCTOF(View view) {
        Intent intent = new Intent(this, TemperatureConversion.class);
        startActivity(intent);
    }

    public void moveToTemperatureConversionFTOC(View view) {
        Intent intent = new Intent(this, Temperature1.class);
        startActivity(intent);
    }


}