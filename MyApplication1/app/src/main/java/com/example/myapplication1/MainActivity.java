package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button button;
    public static TextView tv2;
    TextView tv1;
    Button button1;
    EditText ed1,ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        tv2=(TextView) findViewById(R.id.textView);
        tv1=(TextView) findViewById(R.id.textView2);
        ed1=(EditText) findViewById(R.id.editTextNumber);
        ed2=(EditText) findViewById(R.id.editTextNumber2);
        button1=(Button) findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ThreadDemo th1=new ThreadDemo();
                th1.start();
                //textView.setText("Button Clicked");
               // Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

       button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int a = Integer.parseInt(ed1.getText().toString());
                    int b = Integer.parseInt(ed2.getText().toString());
                    int result = Calc.add(a, b);
                    tv1.setText(Integer.toString(result));
                    Toast.makeText(getApplicationContext(), String.valueOf(result), Toast.LENGTH_SHORT).show();
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}