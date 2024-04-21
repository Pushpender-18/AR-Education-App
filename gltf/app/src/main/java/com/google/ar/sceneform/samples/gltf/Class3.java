package com.google.ar.sceneform.samples.gltf;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Class3 extends AppCompatActivity implements View.OnClickListener {
    private Button btnBodyParts, btnFaceParts;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.class3);

        btnBodyParts = findViewById(R.id.btnBodyParts);
        btnFaceParts = findViewById(R.id.btnFaceParts);

        btnBodyParts.setOnClickListener(this);
        btnFaceParts.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(Class3.this, GltfActivity.class);
        switch(view.getId()) {
            case R.id.btnBodyParts:
                i.putExtra("model", R.raw.perfect_human_body);
                startActivity(i);
                break;
            case R.id.btnFaceParts:
                i.putExtra("model", R.raw.perfect_human_body);
                startActivity(i);
                break;
            default:
                break;
        }
    }
}
