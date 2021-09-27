package com.example.pc.passivhaus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity implements View.OnClickListener {

    Button FRegister;
    EditText etName, etSurname, etEMail, etPassword , etCheckPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etName = (EditText) findViewById(R.id.etName);
        etSurname =(EditText)  findViewById(R.id.etSurname);
        etEMail = (EditText) findViewById(R.id.etEMail)    ;
        etPassword =(EditText) findViewById(R.id.etpassword);
        etCheckPassword = (EditText)  findViewById(R.id.etcheckpassword);
        FRegister = (Button) findViewById(R.id.FRegister);
        FRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId(
        )){
            case R.id.FRegister:

                startActivity(new Intent(this,Login_Register.class));

                break;



        }
    }

}
