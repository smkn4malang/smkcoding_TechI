package com.dycode.edu.perfect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    Animation fromright,fromlrft,fadein,frombot;
    EditText edit2;
    EditText edit1;
    TextView banner;

    private Button btn3,btn,btn2;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        banner=(TextView)findViewById(R.id.banner);
        edit1 = (EditText) findViewById(R.id.editText);
        edit2=(EditText)findViewById(R.id.editText2) ;

        fadein= AnimationUtils.loadAnimation(this,R.anim.fadein);
        fromright= AnimationUtils.loadAnimation(this,R.anim.fromright);
        fromlrft= AnimationUtils.loadAnimation(this,R.anim.fromlrft);
        frombot=AnimationUtils.loadAnimation(this,R.anim.frombot);
        banner.setAnimation(fadein);
        edit2.setAnimation(fromright);
        edit1.setAnimation(fromlrft);



        btn=(Button)findViewById(R.id.button);
        btn2=(Button)findViewById(R.id.button2);
        btn3 = (Button)findViewById(R.id.button3 );

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, Register.class);
                startActivity(intent);
            }
        });
    }
}
