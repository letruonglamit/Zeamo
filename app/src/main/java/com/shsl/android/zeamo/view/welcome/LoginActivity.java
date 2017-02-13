package com.shsl.android.zeamo.view.welcome;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.shsl.android.zeamo.R;
import com.shsl.android.zeamo.view.MainActivity;


public class LoginActivity extends AppCompatActivity {

    Button btnLogin;

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


        btnLogin = (Button) findViewById(R.id.btnloginmain);
        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View agr0){
                Intent main = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(main);
            }
        });
//        btnLogin = (Button) findViewById(R.id.btnloginmain);
//        btnLogin.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View agr0){
//                Intent main = new Intent(LoginActivity.this, SpinningContentFragment.class);
//                startActivity(main);
//            }
//        });


    }
}
