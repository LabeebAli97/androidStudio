package com.example.threaexample;

public class ThreadDemo extends Thread{
    @Override
    public void run()
    {
        //System.out.println(
        ThreadDemo.display();
        // );
    }
    public static int display()
    {
        for(int i=0;i<=500;i++)
        {
            try {
                Thread.sleep(3000);
                MainActivity.tv1.setText(String.valueOf(i));
            }
            catch(InterruptedException ie)
            {
            }
            System.out.println(i);
        }
        return 0;
    }
}
