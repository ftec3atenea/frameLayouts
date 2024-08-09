package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // enlazar el mundo visual con el mundo lógico
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        ImageView iv1 = findViewById(R.id.iv1);

        // asociar el evento click al boton 1
        btn1.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
        });

        // asociar el evento click al boton 2
        btn2.setOnClickListener(v -> {
            if ( iv1.getVisibility() == View.VISIBLE ) {
                iv1.setVisibility(View.GONE);
            } else {
                iv1.setVisibility(View.VISIBLE);
            }
        });

    }
}