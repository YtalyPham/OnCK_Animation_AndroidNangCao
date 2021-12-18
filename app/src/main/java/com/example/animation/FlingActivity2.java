package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FlingAnimation;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FlingActivity2 extends AppCompatActivity {

    Button btnAnim;
    ImageView imgPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fling2);

        btnAnim = findViewById(R.id.btnAnim);
        imgPhone = findViewById(R.id.imgPhone);

        btnAnim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FlingAnimation flingAnim = new FlingAnimation(imgPhone, DynamicAnimation.TRANSLATION_X)
                        // Sets the start velocity to -2000 (pixel/s)
                        .setStartVelocity(-3000)
                        // Optional but recommended to set a reasonable min and max range for the animation.
                        // In this particular case, we set the min and max to -200 and 2000 respectively.
                        .setMinValue(-200).setMaxValue(2000);
                flingAnim.start();

            }
        });
    }
}