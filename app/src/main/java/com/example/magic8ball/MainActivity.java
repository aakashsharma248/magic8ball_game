package com.example.magic8ball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ballDisplay=findViewById(R.id.imageView2);


        final int ballArray[]=new int[]{

                R.drawable.img_1,
                R.drawable.img_2,
                R.drawable.img_3,
                R.drawable.img_4,
                R.drawable.img_5

        };

        Button myButton =findViewById(R.id.askButton);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rn=new Random();
                int number=rn.nextInt(5);
                int s=ballArray[number];
                ballDisplay.setImageResource(ballArray[number]);
            }
        });

    }
}