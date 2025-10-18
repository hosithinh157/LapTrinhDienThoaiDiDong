package com.example.thigk;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    EditText edtWeight, edtHeight;
    Button btnCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtWeight = findViewById(R.id.edtWeight);
        edtHeight = findViewById(R.id.edtHeight);
        btnCalculate = findViewById(R.id.btnCalculate);

        btnCalculate.setOnClickListener(v -> {
            String weightStr = edtWeight.getText().toString();
            String heightStr = edtHeight.getText().toString();

            if(weightStr.isEmpty() || heightStr.isEmpty()) {
                Toast.makeText(this, "Vui lòng nhập đủ thông tin!", Toast.LENGTH_SHORT).show();
                return;
            }

            double weight = Double.parseDouble(weightStr);
            double height = Double.parseDouble(heightStr);

            Intent intent = new Intent(MainActivity.this, ResultActivity.class);
            intent.putExtra("weight", weight);
            intent.putExtra("height", height);
            startActivity(intent);
        });
    }
}