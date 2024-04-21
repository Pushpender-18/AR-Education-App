package com.google.ar.sceneform.samples.gltf;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Class1 extends AppCompatActivity implements View.OnClickListener {
    private Button btnShapes, btnAlphabets, btnNumbers;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.class1);

        ActionBar bar = getSupportActionBar();
        assert bar != null;
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#B1DC45")));


        btnShapes = findViewById(R.id.btnShapes);
        btnAlphabets = findViewById(R.id.btnAlphabets);
        btnNumbers = findViewById(R.id.btnNumbers);
        btnShapes.setOnClickListener(this);
        btnAlphabets.setOnClickListener(this);
        btnNumbers.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnShapes:
                startActivity(new Intent(Class1.this, shapes.class));
                break;
            case R.id.btnAlphabets:
                startActivity(new Intent(Class1.this, Alphabets.class));
                break;
            case R.id.btnNumbers:
                startActivity(new Intent(Class1.this, Numbers.class));
                break;

            default:
                break;
        }
    }
}
