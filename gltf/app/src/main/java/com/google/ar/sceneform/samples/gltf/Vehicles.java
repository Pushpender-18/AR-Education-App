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

public class Vehicles extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.submenu);

        final ListView lstSubMenu = findViewById(R.id.lstSubMenu);

        ArrayList<String> vehicles = new ArrayList<>();
        vehicles.add("Bus");
        vehicles.add("Helicopter");
        vehicles.add("Truck");
        vehicles.add("Rickshaw");

        ArrayAdapter<String> vehiclesAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                vehicles);

        lstSubMenu.setAdapter(vehiclesAdapter);

        lstSubMenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Vehicles.this, GltfActivity.class);
                switch(vehicles.get(i)) {
                    case "Bus":
                        intent.putExtra("model", R.raw.bus);
                        startActivity(intent);
                        break;
                    case "Helicopter":
                        intent.putExtra("model", R.raw.helicopter);
                        startActivity(intent);
                        break;
                    case "Truck":
                        intent.putExtra("model", R.raw.truck);
                        startActivity(intent);
                        break;
                    case "Rickshaw":
                        intent.putExtra("model", R.raw.rickshaw);
                        startActivity(intent);
                        break;

                }
            }
        });
    }
}
