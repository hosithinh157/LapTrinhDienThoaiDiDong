package com.example.thigk;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.content.Intent;

public class ResultActivity extends AppCompatActivity {

    TextView tvBMIValue, tvStatus;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tvBMIValue = findViewById(R.id.tvBMIValue);
        tvStatus = findViewById(R.id.tvStatus);
        btnBack = findViewById(R.id.btnBack);

        Intent intent = getIntent();
        double weight = intent.getDoubleExtra("weight", 0);
        double height = intent.getDoubleExtra("height", 0);

        double bmi = weight / (height * height);
        tvBMIValue.setText(String.format("%.2f", bmi));

        String status;
        if (bmi < 18.5) status = "Thiếu cân";
        else if (bmi < 24.9) status = "Bình thường";
        else if (bmi < 29.9) status = "Thừa cân";
        else status = "Béo phì";

        tvStatus.setText(status);

        btnBack.setOnClickListener(v -> finish());
    }
}