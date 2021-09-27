package com.example.pc.passivhaus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Mainpage extends AppCompatActivity implements View.OnClickListener {

    Button gunes;
    Button geridonusum;
    Button yagmursuyu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);

        gunes = (Button) findViewById(R.id.gunes);
        geridonusum = (Button) findViewById(R.id.geridonusum);
        yagmursuyu = (Button) findViewById(R.id.FRegister);

        gunes.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.gunes:

                startActivity(new Intent(this,Gunespaneli.class));

                break;

        }
    }
}


