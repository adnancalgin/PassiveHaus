package com.example.pc.passivhaus;

    import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Login_Register extends AppCompatActivity implements View.OnClickListener {

    Button Login;
    EditText etUsername, etPassword,etEMail;
    TextView TvRegisterlink;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__register);

        etUsername =(EditText) findViewById(R.id.etUsername);
        etPassword =(EditText) findViewById(R.id.etpassword);
        etEMail = (EditText) findViewById(R.id.etevnumarası);
        Login =(Button) findViewById(R.id.Login);
        TvRegisterlink = (TextView) findViewById(R.id.TvRegisterlink);

        Login.setOnClickListener(this);
        TvRegisterlink.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Login:

                startActivity(new Intent(this,Mainpage.class));
                break;

            case R.id.TvRegisterlink:

                startActivity(new Intent(this,Register.class   ));

                break;


        }
    }
}