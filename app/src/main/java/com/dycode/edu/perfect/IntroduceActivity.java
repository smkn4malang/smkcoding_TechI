package com.dycode.edu.perfect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class IntroduceActivity extends AppCompatActivity {

    private Button btn;
    Animation frombottom,fromtop;
    TextView text;
    Button but;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduce);
        text = (TextView) findViewById(R.id.tex);
        but=(Button)findViewById(R.id.button) ;
        frombottom= AnimationUtils.loadAnimation(this,R.anim.frombot);
        fromtop= AnimationUtils.loadAnimation(this,R.anim.fromtop);
        but.setAnimation(frombottom);
        text.setAnimation(fromtop);
        btn = (Button)findViewById(R.id.button );

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IntroduceActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
