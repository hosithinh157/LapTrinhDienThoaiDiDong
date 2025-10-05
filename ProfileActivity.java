package com.example.btchuyenactivity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;
import android.content.Intent;

public class ProfileActivity extends AppCompatActivity {
    TextView tvProfileName, tvEmail, tvPhone, tvSkype, tvWeb;
    ImageView imgSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        tvProfileName = findViewById(R.id.tvProfileName);
        tvEmail = findViewById(R.id.tvEmail);
        tvPhone = findViewById(R.id.tvPhone);
        tvSkype = findViewById(R.id.tvSkype);
        tvWeb = findViewById(R.id.tvWeb);
        imgSetting = findViewById(R.id.imgSetting);

        // Lấy dữ liệu từ LoginActivity
        String username = getIntent().getStringExtra("username");
        tvProfileName.setText(username);

        tvEmail.setText("Email: " + username.toLowerCase() + "@gmail.com");
        tvPhone.setText("Phone: +84 123 456 789");
        tvSkype.setText("Skype: " + username);
        tvWeb.setText("Web: www." + username.toLowerCase() + ".com");

        imgSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(ProfileActivity.this, LoginActivity.class);
                startActivity(back);
                finish();
            }
        });
    }
}
