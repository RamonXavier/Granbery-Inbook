package com.example.granberyinbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText str_user;
    private EditText str_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        str_user = (EditText) findViewById(R.id.usr);
        str_pass = (EditText) findViewById(R.id.pass);
    }

    public void login(View view){
        String user = String.valueOf(str_user.getText());
        String password = String.valueOf(str_pass.getText());

        String U = "master";
        String P = "123";

        if (user.equals(U) && password.equals(P)){
            Intent intentMenu = new Intent(getApplicationContext(),MenuActivity.class);
            intentMenu.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
            startActivity(intentMenu);
            this.finish();
        }else {
            Toast.makeText(MainActivity.this, "O Usuário: " + str_user.getText() +",  e Senha: " + str_pass.getText() + " estão incorretos!", Toast.LENGTH_LONG).show();
        }
    }
}

