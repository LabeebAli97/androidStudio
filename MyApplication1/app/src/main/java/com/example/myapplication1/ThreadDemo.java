package com.example.myapplication1;

public class ThreadDemo extends Thread{

    @Override
    public void run()
    {
        for(int j=0;j<=5;j++)
        {
            try {
                Thread.sleep(2000);
                MainActivity.tv2.setText(String.valueOf(j));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(j);
        }
    }

}
