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

public class SolarSystem extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.submenu);

        final ListView lstSubMenu = findViewById(R.id.lstSubMenu);

        final ArrayList<String> solarSystem = new ArrayList<>();
        solarSystem.add("Sun");
        solarSystem.add("Mercury");
        solarSystem.add("Venus");
        solarSystem.add("Earth");
        solarSystem.add("Mars");
        solarSystem.add("Jupiter");
        solarSystem.add("Saturn");
        solarSystem.add("Neptune");
        solarSystem.add("Uranus");

        final ArrayAdapter<String> solarSystemAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                solarSystem);

        lstSubMenu.setAdapter(solarSystemAdapter);

        lstSubMenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(SolarSystem.this, GltfActivity.class);
                switch (solarSystem.get(i)) {
                    case "Sun":
                        intent.putExtra("model", R.raw.sun);
                        startActivity(intent);
                        break;
                    case "Mercury":
                        intent.putExtra("model", R.raw.mercury);
                        startActivity(intent);
                        break;
                    case "Venus":
                        intent.putExtra("model", R.raw.venus);
                        startActivity(intent);
                        break;
                    case "Earth":
                        intent.putExtra("model", R.raw.earth);
                        startActivity(intent);
                        break;
                    case "Mars":
                        intent.putExtra("model", R.raw.mars);
                        startActivity(intent);
                        break;
                    case "Jupiter":
                        intent.putExtra("model", R.raw.jupiter);
                        startActivity(intent);
                        break;
                    case "Saturn":
                        intent.putExtra("model", R.raw.saturn_planet);
                        startActivity(intent);
                        break;
                    case "Neptune":
                        intent.putExtra("model", R.raw.neptune);
                        startActivity(intent);
                        break;
                    case "Uranus":
                        intent.putExtra("model", R.raw.planet_uranus);
                        startActivity(intent);
                        break;
                }
            }
        });

    }
}
