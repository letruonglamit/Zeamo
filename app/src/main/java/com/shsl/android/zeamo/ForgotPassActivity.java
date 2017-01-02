package com.shsl.android.zeamo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by shsl on 20/10/2016.
 */

public class ForgotPassActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_forgotpass);

//        ImageButton comeBackFG = (ImageButton)findViewById(R.id.imgBtnBack_login);
//        comeBackFG.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View agr0){
//                Intent i = new Intent(ForgotPassActivity.this, LoginActivity.class);
//                startActivity(i);
//            }
//        });
    }
}
