package com.example.primeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnLogin;
    EditText etCorreo,etPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        llamarLogin();
    }
    public void llamarLogin(){
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etCorreo = (EditText) findViewById(R.id.etCorreo);
                etPass = (EditText) findViewById(R.id.etPass);
                String correo = etCorreo.getText().toString();
                String pass = etPass.getText().toString();
                if(correo.equals("admin@admin.cl") && pass.equals("admin")){
                    Toast.makeText(MainActivity.this, "Entrando...", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(MainActivity.this,PrincipalActivity.class);
                    startActivity(i);
                }else{
                    Toast.makeText(MainActivity.this, "Acceso denegado", Toast.LENGTH_SHORT).show();
                }
                }
        });
    }
}




