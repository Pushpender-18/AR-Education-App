package com.google.ar.sceneform.samples.gltf;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Geometry extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.submenu);

        final ListView lstSubmenu = findViewById(R.id.lstSubMenu);

        final ArrayList<String> geomtry = new ArrayList<>();
        geomtry.add("Sphere");
        geomtry.add("Cone");
        geomtry.add("Cube");
        geomtry.add("Cuboid");

        final ArrayAdapter<String> geomtryAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                geomtry);

        lstSubmenu.setAdapter(geomtryAdapter);

        lstSubmenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Geometry.this, GltfActivity.class);
                switch(geomtryAdapter.getItem(i)) {
                    case "Sphere":
                        intent.putExtra("model", R.raw.sphere);
                        startActivity(intent);
                        break;
                    case "Cone":
                        intent.putExtra("model", R.raw.blender_cone_royalty_free);
                        startActivity(intent);
                        break;
                    case "Cube":
                        intent.putExtra("model", R.raw.burning_cube);
                        startActivity(intent);
                        break;
                    case "Cuboid":
                        intent.putExtra("model", R.raw.cuboid);
                        startActivity(intent);
                        break;

                }
            }
        });


    }
}
