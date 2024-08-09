package com.example.myapplication;

import static kotlinx.coroutines.DelayKt.delay;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.os.Handler;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // enlazar el mundo visual con el mundo lógico
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        ImageView iv2 = findViewById(R.id.iv2);

        // vamos a crear las animaciones
        Animation anim1 = AnimationUtils.loadAnimation(this, R.anim.fade_out);
        Animation anim2 = AnimationUtils.loadAnimation(this, R.anim.rotate_anti);

        //Creamos el intent para ir a la actividad 3
        Intent intent = new Intent(this, MainActivity3.class);

        // vamos a asociar las animaciones a los botones
        btn3.setOnClickListener(v -> {
            iv2.startAnimation(anim1);

            // Crear un Handler para retrasar la acción
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    // Iniciamos el paso a la actividad 3
                    startActivity(intent);
                }
            }, 1000); // Delay de 1000 milisegundos (1 segundos)
        });

        btn4.setOnClickListener(v -> {
            iv2.startAnimation(anim2);
        });

    }
}