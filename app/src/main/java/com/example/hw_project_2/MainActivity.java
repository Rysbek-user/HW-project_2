package com.example.hw_project_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;


public class MainActivity extends AppCompatActivity {
    private TextView entrance;
    private TextView registration;
    private TextView yourPassworld;
    private TextView clicPassworld;
    private EditText email;
    private EditText password;
    private Button come;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        entrance = findViewById(R.id.text0);
        registration = findViewById(androidx.core.R.id.text2);
        yourPassworld = findViewById(R.id.text_q);
        clicPassworld = findViewById(R.id.text3);
        email = findViewById(R.id.edit_text1);
        password = findViewById(R.id.edit_text2);
        come = findViewById(R.id.button);
        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (password.getText().toString().isEmpty()) {
                    come.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.gray));
                } else {
                    come.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.brown));
                }

            }
        });
        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (email.getText().toString().isEmpty()) {
                    come.setBackgroundColor(Color.GRAY);
                } else {
                    come.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.brown));
                }

            }
        });
        come.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (email.getText().toString().equals("admin") &&
                        password.getText().toString().equals("admin")) {
                    entrance.setVisibility(View.GONE);
                    registration.setVisibility(View.GONE);
                    yourPassworld.setVisibility(View.GONE);
                    clicPassworld.setVisibility(View.GONE);
                    email.setVisibility(View.GONE);
                    password.setVisibility(View.GONE);
                    come.setVisibility(View.GONE);
                    Snackbar.make(findViewById(android.R.id.content), "Вы успешно зарегистрировались", Snackbar.LENGTH_SHORT).show();
                } else {
                    Snackbar.make(findViewById(android.R.id.content), "Не правильный логин или пароль", Snackbar.LENGTH_SHORT).show();
                }
            }
        });
    }
}
