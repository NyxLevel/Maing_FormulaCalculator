package com.example.maing_formulacalculator.Volume;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.maing_formulacalculator.R;

public class Cone extends AppCompatActivity implements View.OnClickListener {

    EditText txt_radius, txt_height;
    double var1, var2 ,ans;
    TextView txt_answer;
    Button btn_calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cone);
        btn_calc = findViewById(R.id.calc);
        txt_radius = findViewById(R.id.var1);
        txt_height = findViewById(R.id.var2);
        txt_answer = findViewById(R.id.answer);
        btn_calc.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        var1 = Double.parseDouble(txt_radius.getText().toString());
        var2 = Double.parseDouble(txt_height.getText().toString());
        ans = Math.PI* var1 *var1* var2;
        txt_answer.setText("Answer: " + ans);
    }

}