package com.example.myapplication;

import android.os.Bundle;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        // enlazar el mundo visual con el mundo lógico
        Button btn5 = findViewById(R.id.btn5);
        ImageView iv3 = findViewById(R.id.iv3);

        // asociar el evento click al boton 5
        btn5.setOnClickListener(v -> {
            // creamos un Animation Set
            AnimationSet animSet = new AnimationSet(true);

            // agregamos las animaciones al Animation Set
            animSet.addAnimation(new ScaleAnimation(0.5f, 1.5f, 0.5f, 1.5f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f));
            animSet.addAnimation(new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f));

            // establecemos la duración de la animación
            animSet.setDuration(2000);

            // establecemos el interpolador de la animación
            animSet.setInterpolator(new AccelerateDecelerateInterpolator());

            // aplicamos la animación al ImageView
            iv3.startAnimation(animSet);
        });
    }
}