package com.example.threaexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt1=(Button)findViewById(R.id.b1);
        tv1=(TextView)findViewById(R.id.tv1);

        bt1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ThreadDemo th1=new ThreadDemo();
                th1.start();
                /*int a=Integer.parseInt(ed1.getText().toString());
                int b=Integer.parseInt(ed2.getText().toString());
                int result=Calc.add(a,b);
                tv1.setText(Integer.toString(result));*/
            }
        });
    }
}