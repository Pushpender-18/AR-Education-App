package com.google.ar.sceneform.samples.gltf;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Class2 extends AppCompatActivity implements View.OnClickListener {

    private Button btnMoney, btnVehicles;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.class2);

        btnMoney = findViewById(R.id.btnMoney);
        btnVehicles = findViewById(R.id.btnVehicles);

        btnMoney.setOnClickListener(this);
        btnVehicles.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        Intent i = new Intent(Class2.this, GltfActivity.class);
        switch (view.getId()) {
            case R.id.btnMoney:
                startActivity(new Intent(Class2.this, Money.class));
                break;
            case R.id.btnVehicles:
                startActivity(new Intent(Class2.this, Vehicles.class));
                break;
            default:
                break;
        }
    }
}
