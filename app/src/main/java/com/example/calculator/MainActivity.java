package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private long display=0;
    private String sign="";
    private long secondDisplay=0;
    private long answer=0,a1=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView) findViewById(R.id.output);
    }
    public void seven(View view)
    {
        if(a1==0)
        {
        display=display+7;
        textView.setText(String.valueOf(display));
        display=display*10;}
        else
        {
           secondDisplay=secondDisplay+7;
            textView.setText(String.valueOf((display/10)+sign+secondDisplay));
            secondDisplay=secondDisplay*10;
        }
    }
    public void eight(View view)
    {
        if(a1==0)
    {
        display=display+8;
        textView.setText(String.valueOf(display));
        display=display*10;}
    else
    {
        secondDisplay=secondDisplay+8;
        textView.setText(String.valueOf((display/10)+sign+secondDisplay));
        secondDisplay=secondDisplay*10;
    }
    }
    public void nine(View view)
    {
        if(a1==0)
        {
            display=display+9;
            textView.setText(String.valueOf(display));
            display=display*10;}
        else
        {
            secondDisplay=secondDisplay+9;
            textView.setText(String.valueOf((display/10)+sign+secondDisplay));
            secondDisplay=secondDisplay*10;
        }
    }
    public void four(View view)
    {
        if(a1==0)
        {
            display=display+4;
            textView.setText(String.valueOf(display));
            display=display*10;}
        else
        {
            secondDisplay=secondDisplay+4;
            textView.setText(String.valueOf((display/10)+sign+secondDisplay));
            secondDisplay=secondDisplay*10;
        }
    }
    public void five(View view)
    {
        if(a1==0)
        {
            display=display+5;
            textView.setText(String.valueOf(display));
            display=display*10;}
        else
        {
            secondDisplay=secondDisplay+5;
            textView.setText(String.valueOf((display/10)+sign+secondDisplay));
            secondDisplay=secondDisplay*10;
        }
    }
    public void six(View view)
    {
        if(a1==0)
        {
            display=display+6;
            textView.setText(String.valueOf(display));
            display=display*10;}
        else
        {
            secondDisplay=secondDisplay+6;
            textView.setText(String.valueOf((display/10)+sign+secondDisplay));
            secondDisplay=secondDisplay*10;
        }
    }
    public void one(View view)
    {
        if(a1==0)
        {
            display=display+1;
            textView.setText(String.valueOf(display));
            display=display*10;}
        else
        {
            secondDisplay=secondDisplay+1;
            textView.setText(String.valueOf((display/10)+sign+secondDisplay));
            secondDisplay=secondDisplay*10;
        }
    }
    public void two(View view)
    {
        if(a1==0)
        {
            display=display+2;
            textView.setText(String.valueOf(display));
            display=display*10;}
        else
        {
            secondDisplay=secondDisplay+2;
            textView.setText(String.valueOf((display/10)+sign+secondDisplay));
            secondDisplay=secondDisplay*10;
        }
    }
    public void three(View view)
    {
        if(a1==0)
        {
            display=display+3;
            textView.setText(String.valueOf(display));
            display=display*10;}
        else
        {
            secondDisplay=secondDisplay+3;
            textView.setText(String.valueOf((display/10)+sign+secondDisplay));
            secondDisplay=secondDisplay*10;
        }
    }
    public void zero(View view)
    {
        if(a1==0)
        {
            display=display+0;
            textView.setText(String.valueOf(display));
            display=display*10;}
        else
        {
            secondDisplay=secondDisplay+0;
            textView.setText(String.valueOf((display/10)+sign+secondDisplay));
            secondDisplay=secondDisplay*10;
        }
    }
    public void c(View view)
    {
        display=0;
        a1=0;
        secondDisplay=0;
        textView.setText(String.valueOf(display));
    }
    public void backSpace(View view)
    {
        if(a1==0)
        {
        display=display/10;
        textView.setText(String.valueOf(display));}
        else
        {
            secondDisplay=secondDisplay/10;
            textView.setText(String.valueOf((display/10))+sign+secondDisplay);
        }
    }
    public void addition(View view)
    {
        a1=1;
        sign="+";
        textView.setText(String.valueOf((display)/10+sign));
    }
    public void subtraction(View view)
    {
        a1=1;
        sign="-";
        textView.setText(String.valueOf((display)/10+sign));
    }
    public void division(View view)
    {
        a1=1;
        sign="/";
        textView.setText(String.valueOf((display)/10+sign));
    }
    public void multiplication(View view)
    {
        a1=1;
        sign="*";
        textView.setText(String.valueOf((display)/10+sign));
    }
    public void equal(View view)
    {

        if(sign.equals("+"))
        {answer=((secondDisplay/10)+(display)/10);
        textView.setText(String.valueOf(answer));
        answer=0;
        sign="";}
        else if(sign.equals("-"))
        {answer=((display/10)-(secondDisplay)/10);
            textView.setText(String.valueOf(answer));
            answer=0;
            sign="";}
        else if(sign.equals("*"))
        {answer=((secondDisplay/10)*(display)/10);
            textView.setText(String.valueOf(answer));
            answer=0;
            sign="";}
        else if(sign.equals("/"))
        {answer=((display/10)/(secondDisplay)/10);
            textView.setText(String.valueOf(answer));
            answer=0;
            sign="";}

    }


}
