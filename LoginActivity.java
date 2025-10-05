package com.example.btchuyenactivity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.*;
import android.view.View;

public class LoginActivity extends AppCompatActivity {
    EditText edtUsername, edtPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = edtUsername.getText().toString();
                String pass = edtPassword.getText().toString();

                if(user.isEmpty() || pass.isEmpty()){
                    Toast.makeText(LoginActivity.this, "Please enter username and password", Toast.LENGTH_SHORT).show();
                }
                if (user.equals("admin") && pass.equals("1234")) {
                    Intent i = new Intent(LoginActivity.this, ProfileActivity.class);
                    i.putExtra("username", user);
                    startActivity(i);
                } else {
                    Toast.makeText(LoginActivity.this, "Sai username hoặc password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}