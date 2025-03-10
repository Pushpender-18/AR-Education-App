package com.google.ar.sceneform.samples.gltf;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Class4 extends AppCompatActivity implements View.OnClickListener {
    private Button btnSolarSystem, btnGeometry;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.class4);

        btnSolarSystem = findViewById(R.id.btnSolarSystem);
        btnGeometry = findViewById(R.id.btnGeometry);

        btnSolarSystem.setOnClickListener(this);
        btnGeometry.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(Class4.this, GltfActivity.class);
        switch (view.getId()) {
            case R.id.btnSolarSystem:
                startActivity(new Intent(Class4.this, SolarSystem.class));
                break;
            case R.id.btnGeometry:
                startActivity(new Intent(Class4.this, Geometry.class));
                break;
            default:
                break;
        }
    }
}
