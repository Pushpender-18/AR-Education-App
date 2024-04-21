package com.google.ar.sceneform.samples.gltf;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

public class LearnPage extends AppCompatActivity implements View.OnClickListener {

    private CardView cdClass1, cdClass2, cdClass3, cdClass4;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.learn_page);

        cdClass1 = findViewById(R.id.class1Card);
        cdClass2 = findViewById(R.id.class2Card);
        cdClass3 = findViewById(R.id.class3Card);
        cdClass4 = findViewById(R.id.class4Card);

        cdClass1.setOnClickListener(this);
        cdClass2.setOnClickListener(this);
        cdClass3.setOnClickListener(this);
        cdClass4.setOnClickListener(this);


    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.class1Card:
                startActivity(new Intent(LearnPage.this, Class1.class));
                break;
            case R.id.class2Card:
                startActivity(new Intent(LearnPage.this, Class2.class));
                break;
            case R.id.class3Card:
                startActivity(new Intent(LearnPage.this, Class3.class));
                break;
            case R.id.class4Card:
                startActivity(new Intent(LearnPage.this, Class4.class));
                break;
            default:
                break;
        }
    }
}
