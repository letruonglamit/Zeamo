package com.shsl.android.zeamo.view.welcome;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.shsl.android.zeamo.R;


public class WelcomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_welcome);

        Button btnCreate = (Button)findViewById(R.id.btnCreateAccount);
        Button btnLogin = (Button)findViewById(R.id.btnLogIn);
        btnCreate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View agr0){
                Intent i = new Intent(WelcomeActivity.this, CreateAccountActivity1.class);
                startActivity(i);
            }
        });


        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View agr0){
                Intent j = new Intent(WelcomeActivity.this, LoginActivity.class);
                startActivity(j);
            }
        });
    }



}
