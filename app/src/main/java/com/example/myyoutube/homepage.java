package com.example.myyoutube;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class homepage extends AppCompatActivity {

    Button martin;
    Button Chainsmokers;
    Button kshmr;
    Button avicii;
    Button zayn;
    Button djsnake;
    Button marshmellow;
    Button justinbieber;
    Button afrojack;
    Button alanwalker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);


        martin = findViewById(R.id.martin);
        Chainsmokers = findViewById(R.id.chainsmokers);
        kshmr = findViewById(R.id.kshmr);
        avicii = findViewById(R.id.avicii);
        zayn = findViewById(R.id.zayn);
        djsnake = findViewById(R.id.snake);
        marshmellow = findViewById(R.id.marshmellow);
        justinbieber = findViewById(R.id.justin);
        afrojack = findViewById(R.id.afrojack);
        alanwalker = findViewById(R.id.alan);


        martin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homepage.this, MartinGarrix.class);
                startActivity(intent);
            }
        });


        Chainsmokers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homepage.this, ChainSmokers.class);
                startActivity(intent);
            }
        });


        kshmr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homepage.this, Kshmr.class);
                startActivity(intent);
            }
        });

        avicii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homepage.this, Avicii.class);
                startActivity(intent);
            }
        });

        zayn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homepage.this, Zayn.class);
                startActivity(intent);
            }
        });

        djsnake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homepage.this, Djsnake.class);
                startActivity(intent);
            }
        });

        marshmellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homepage.this, Marshmellow.class);
                startActivity(intent);
            }
        });

        justinbieber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homepage.this, JustinBieber.class);
                startActivity(intent);
            }
        });

        afrojack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homepage.this, Afrojack.class);
                startActivity(intent);
            }
        });
        alanwalker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homepage.this, AlanWalker.class);
                startActivity(intent);
            }
        });

    }
}
