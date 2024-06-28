package com.example.blogapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignupPage extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4,ed5,ed6;
    AppCompatButton b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_signup_page);
        ed1=(EditText) findViewById(R.id.name);
        ed2=(EditText) findViewById(R.id.age);
        ed3=(EditText) findViewById(R.id.mob);
        ed4=(EditText) findViewById(R.id.username);
        ed5=(EditText) findViewById(R.id.newpass);
        ed6=(EditText) findViewById(R.id.conpass);
        b1=(AppCompatButton) findViewById(R.id.register);
        b2=(AppCompatButton) findViewById(R.id.backtolog);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getName=ed1.getText().toString();
                String getAge=ed2.getText().toString();
                String getMob=ed3.getText().toString();
                String getUsername=ed4.getText().toString();
                String getPass=ed5.getText().toString();
                String getConpass=ed6.getText().toString();
                Toast.makeText(getApplicationContext(),getName+" "+getAge+" "+getMob+" "+getUsername+" "+getPass+" "+getConpass,Toast.LENGTH_LONG).show();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }
}