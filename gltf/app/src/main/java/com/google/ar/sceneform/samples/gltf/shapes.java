package com.google.ar.sceneform.samples.gltf;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class shapes extends AppCompatActivity {

    private ListView lstShapes;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.shapes);
        lstShapes = findViewById(R.id.lstShapes);
        ArrayList<String> shapes = new ArrayList<>();
        shapes.add("Circle");

        ArrayAdapter<String> shapesAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                shapes
        );

        lstShapes.setAdapter(shapesAdapter);

        lstShapes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(shapes.this, GltfActivity.class);
                switch (shapes.get(i)) {
                    case "Circle":
                        intent.putExtra("model", R.raw.circle);
                        startActivity(intent);
                        break;
                    default:
                        break;
                }
            }
        });
    }

}
