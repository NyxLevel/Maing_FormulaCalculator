package com.example.maing_formulacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.maing_formulacalculator.Area.Circle;
import com.example.maing_formulacalculator.Area.Rectangle;
import com.example.maing_formulacalculator.Area.Square;
import com.example.maing_formulacalculator.Volume.Cone;
import com.example.maing_formulacalculator.Volume.Cube;
import com.example.maing_formulacalculator.Volume.Rectangular_Prism;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn_circle);
        btn2 = (Button) findViewById(R.id.btn_rectangle);
        btn3 = (Button) findViewById(R.id.btn_square);
        btn4 = (Button) findViewById(R.id.btn_cone);
        btn5 = (Button) findViewById(R.id.btn_prism);
        btn6 = (Button) findViewById(R.id.btn_cube);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Circle.class));
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Rectangle.class));
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Square.class));
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Cone.class));
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Rectangular_Prism.class));
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Cube.class));
            }
        });
    }
}