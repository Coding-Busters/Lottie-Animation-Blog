package com.codingbusters.lottieanimationblog;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    LottieAnimationView lottieAnimationView;
    Button button;
    Boolean Loading = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//      initializing button and view
        lottieAnimationView = findViewById(R.id.animationView);
        button = findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Loading==false){
                    lottieAnimationView.playAnimation();
                    button.setText("Pause Animation");
                    Loading = true;
                }else {
                    lottieAnimationView.pauseAnimation();
                    button.setText("Play Animation");
                    Loading = false;
                }
            }
        });
    }
}