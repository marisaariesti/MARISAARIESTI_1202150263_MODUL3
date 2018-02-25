package com.example.marisaariesti.marisaariesti_1202150263_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText user, pass;
    Button Blogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user = (EditText)findViewById(R.id.editText_user);
        pass = (EditText)findViewById(R.id.editText_pass);
        Blogin = (Button)findViewById(R.id.button_login);


        Blogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernamekey = user.getText().toString();
                String passwordkey = pass.getText().toString();

                if (usernamekey.equals("EAD")&& passwordkey.equals("MOBILE")){
                    Intent login = new Intent(Login.this, MainActivity.class);
                    startActivity(login);
                    Toast.makeText(Login.this, "Login Berhasil" , Toast.LENGTH_LONG).show();


                }else {
                    Toast.makeText(Login.this,"Login Gagal. Username atau Password Salah!",Toast.LENGTH_LONG).show();

                }
            }
        });
    }
}
