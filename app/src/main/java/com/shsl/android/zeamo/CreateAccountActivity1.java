package com.shsl.android.zeamo;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.shsl.android.zeamo.Checker.EmailValidator;

/**
 * Created by shsl on 18/10/2016.
 */

public class CreateAccountActivity1 extends AppCompatActivity {
    ImageButton btnBack;
    Button btnCreateContinue;
    EditText editEmail, editPass, editRepass;
    TextView textNoti;

    @Override
    protected void onCreate(Bundle saveInstanceState){

        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_createaccount1);

        createControl();

        btnBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View agr0){
                Intent i = new Intent(CreateAccountActivity1.this, WelcomeActivity.class);
                startActivity(i);
            }
        });
        btnCreateContinue.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                if(invalid()){
                    Intent i = new Intent(CreateAccountActivity1.this, CreateAccountActivity2.class);
                }
            }
        });
    }
    public boolean invalid(){
        EmailValidator checkEmail = new EmailValidator();
        String email = editEmail.getText().toString();
        String pass = editEmail.getText().toString();
        String repass = editEmail.getText().toString();
        //Login can't be blank
        //please_enter_valid_email

        if(email.equals("")){
            textNoti.setText(R.string.notiEmailCreatAC);
            editEmail.setBackgroundColor(Color.parseColor("#FCDDDA"));
            textNoti.setTextColor(Color.parseColor("#E56358"));
            return false;
        }
        if(pass.equals("")){
            textNoti.setText(R.string.notiPassCreatAC);
            editPass.setBackgroundColor(Color.parseColor("#FCDDDA"));
            textNoti.setTextColor(Color.parseColor("#E56358"));
            return false;
        }
        if(repass.equals("")){
            textNoti.setText(R.string.notiRepassCreatAC);
            editRepass.setBackgroundColor(Color.parseColor("#FCDDDA"));
            textNoti.setTextColor(Color.parseColor("#E56358"));
            return false;
        }
        if(pass.equals(repass)){
            textNoti.setText(R.string.notiMatchpassCreatAC);
            editRepass.setBackgroundColor(Color.parseColor("#FCDDDA"));
            textNoti.setTextColor(Color.parseColor("#E56358"));
            return false;
        }

        if(!checkEmail.validate("R.string.please_enter_valid_email")){
            textNoti.setText(R.string.notiMatchpassCreatAC);
            editEmail.setBackgroundColor(Color.parseColor("#FCDDDA"));
            textNoti.setTextColor(Color.parseColor("#E56358"));
            return false;
        }
        return true;
    }
    public void createControl(){
        btnBack = (ImageButton)findViewById(R.id.imgBtnBack_create);
        btnCreateContinue = (Button) findViewById(R.id.btnContinueCreateAccount);
        editEmail = (EditText) findViewById(R.id.editEmail);
        editPass = (EditText) findViewById(R.id.editPass);
        editRepass = (EditText) findViewById(R.id.editRepass);
        textNoti = (TextView) findViewById(R.id.textNoti);

    }

}
