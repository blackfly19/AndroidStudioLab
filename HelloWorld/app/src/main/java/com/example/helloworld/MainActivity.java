package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    EditText emailid;
    EditText phoneno;
    EditText password;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emailid = findViewById(R.id.Email);
        phoneno = findViewById(R.id.Phone);
        password = findViewById(R.id.Password);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(emailid.getText().toString());
                System.out.println(phoneno.getText().toString());
                System.out.println(password.getText().toString());
                Intent intent = new Intent(MainActivity.this, details.class);
                intent.putExtra("email",emailid.getText().toString());
                intent.putExtra("phone",phoneno.getText().toString());

                startActivity(intent);
            }
        });


    }
}
