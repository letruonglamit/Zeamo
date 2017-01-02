package com.shsl.android.zeamo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;



public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_login);

        ImageButton comeBack = (ImageButton)findViewById(R.id.imgBtnBack_login);
        comeBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View agr0){
                Intent i = new Intent(LoginActivity.this, WelcomeActivity.class);
                startActivity(i);
            }
        });

        Button btnForgotPassC = (Button)findViewById(R.id.btnForgotPass);
        btnForgotPassC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View agr0){
                Intent i = new Intent(LoginActivity.this, ForgotPassActivity.class);
                startActivity(i);
            }
        });

    }
}
