package com.example.kykylator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    boolean fnum = true;
    String f = "";
    String s = "";
    Float i,p;
    String c = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button num1 = findViewById(R.id.num1);
        Button num2 = findViewById(R.id.num2);
        Button num3 = findViewById(R.id.num3);
        Button num4 = findViewById(R.id.num4);
        Button num5 = findViewById(R.id.num5);
        Button num6 = findViewById(R.id.num6);
        Button num7 = findViewById(R.id.num7);
        Button num8 = findViewById(R.id.num8);
        Button num9 = findViewById(R.id.num9);
        Button num0 = findViewById(R.id.num0);
        Button Zap = findViewById(R.id.Zap);
        Button rezult = findViewById(R.id.rezult);
        Button plus = findViewById(R.id.plus);
        Button chistka = findViewById(R.id.chistka);
        Button minus = findViewById(R.id.minus);
        Button umnog = findViewById(R.id.umnog);
        Button delenie = findViewById(R.id.delenie);
        TextView first_num = findViewById(R.id.first_num);
        TextView second_num = findViewById(R.id.second_num);
        TextView rezalt_vivod = findViewById(R.id.rezalt_vivod);
        plus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                fnum =! fnum;
                i= Float.valueOf(1);
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                fnum =! fnum;
                i= Float.valueOf(2);
            }
        });
        umnog.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                fnum =! fnum;
                i= Float.valueOf(3);
            }
        });
        delenie.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                fnum =! fnum;
                i= Float.valueOf(4);
            }
        });
        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(fnum)
                {
                    f+="1";
                    first_num.setText(f);
                }
                else
                {

                    s+="1";
                    second_num.setText(s);
                }
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(fnum)
                {
                    f+="2";
                    first_num.setText(f);
                }
                else
                {
                    s+="2";
                    second_num.setText(s);
                }
            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(fnum)
                {
                    f+="3";
                    first_num.setText(f);
                }
                else
                {
                    s+="3";
                    second_num.setText(s);
                }
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(fnum)
                {
                    f+="4";
                    first_num.setText(f);
                }
                else
                {
                    s+="4";
                    second_num.setText(s);
                }
            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(fnum)
                {
                    f+="5";
                    first_num.setText(f);
                }
                else
                {
                    s+="5";
                    second_num.setText(s);
                }
            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(fnum)
                {
                    f+="6";
                    first_num.setText(f);
                }
                else
                {
                    s+="6";
                    second_num.setText(s);
                }
            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(fnum)
                {
                    f+="7";
                    first_num.setText(f);
                }
                else
                {
                    s+="7";
                    second_num.setText(s);
                }
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(fnum)
                {
                    f+="8";
                    first_num.setText(f);
                }
                else
                {
                    s+="8";
                    second_num.setText(s);
                }
            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(fnum)
                {
                    f+="9";
                    first_num.setText(f);
                }
                else
                {
                    s+="9";
                    second_num.setText(s);
                }
            }
        });

        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(fnum)
                {
                    f+="0";
                    first_num.setText(f);
                }
                else
                {
                    s+="0";
                    second_num.setText(s);
                }
            }
        });
        Zap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(fnum)
                {
                    f+=".";
                    first_num.setText(f);
                }
                else
                {
                    s+=".";
                    second_num.setText(s);
                }
            }
        });

        rezult.setOnClickListener(new View.OnClickListener() {
            @Override


            public void onClick(View view) {
                Float equality;

                if(i==1) {
                    equality = Float.valueOf(Float.valueOf(first_num.getText().toString()) + Float.valueOf(second_num.getText().toString()));
                    rezalt_vivod.setText(equality.toString());

                }
                else if(i==2) {
                    equality = Float.valueOf(Float.valueOf(first_num.getText().toString()) - Float.valueOf(second_num.getText().toString()));
                    rezalt_vivod.setText(equality.toString());

                }
                else if(i==3) {
                    equality = Float.valueOf(Float.valueOf(first_num.getText().toString()) * Float.valueOf(second_num.getText().toString()));
                    rezalt_vivod.setText(equality.toString());

                }
                else if(i==4) {
                    equality = Float.valueOf(Float.valueOf(first_num.getText().toString()) / Float.valueOf(second_num.getText().toString()));
                    rezalt_vivod.setText(equality.toString());

                }
            }

        });
        chistka.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                fnum = !fnum;
                f="";
                s="";
                i= Float.valueOf(0);
                first_num.setText(" ");
                second_num.setText(" ");
                rezalt_vivod.setText(" ");

            }
        });
    }
}