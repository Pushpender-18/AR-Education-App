package com.google.ar.sceneform.samples.gltf;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
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
        btnShapes = findViewById(R.id.btnShapes);
        btnAlphabets = findViewById(R.id.btnAlphabets);
        btnNumbers = findViewById(R.id.btnNumbers);
        btnShapes.setOnClickListener(this);
        btnAlphabets.setOnClickListener(this);
        btnNumbers.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(Class1.this, GltfActivity.class);
        switch (view.getId()) {
            case R.id.btnShapes:
                i.putExtra("model", R.raw.cuboid);
                Toast.makeText(this, "Launch", Toast.LENGTH_SHORT).show();
                startActivity(i);
                break;
            case R.id.btnAlphabets:
                i.putExtra("model", R.raw.a_alphabet_lore);
                Toast.makeText(this, "Launch", Toast.LENGTH_SHORT).show();
                startActivity(i);
                break;
            case R.id.btnNumbers:
                i.putExtra("model", R.raw.zero);
                Toast.makeText(this, "Launch", Toast.LENGTH_SHORT).show();
                startActivity(i);
                break;

            default:
                break;
        }
    }
}
