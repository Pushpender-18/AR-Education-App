package com.google.ar.sceneform.samples.gltf;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LearnPage extends AppCompatActivity implements View.OnClickListener {

    Button btnClass1, btnClass2, btnClass3, btnClass4;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.learn_page);

        btnClass1 = findViewById(R.id.btnClass1);
        btnClass1.setOnClickListener(this);

        btnClass2 = findViewById(R.id.btnClass2);
        btnClass2.setOnClickListener(this);

        btnClass3 = findViewById(R.id.btnClass3);
        btnClass3.setOnClickListener(this);

        btnClass4 = findViewById(R.id.btnClass4);
        btnClass4.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnClass1:
                startActivity(new Intent(LearnPage.this, Class1.class));
                break;
            case R.id.btnClass2:
                startActivity(new Intent(LearnPage.this, Class2.class));
                break;
            case R.id.btnClass3:
                startActivity(new Intent(LearnPage.this, Class3.class));
                break;
            case R.id.btnClass4:
                startActivity(new Intent(LearnPage.this, Class4.class));
                break;
            default:
                break;
        }
    }
}
