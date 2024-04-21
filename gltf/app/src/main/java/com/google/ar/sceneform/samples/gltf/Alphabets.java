package com.google.ar.sceneform.samples.gltf;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Alphabets extends AppCompatActivity {
    private ListView lstAlphabets;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alphabets);

        lstAlphabets = findViewById(R.id.lstAlphabets);
        ArrayList<String> alphabets = new ArrayList<>();
        alphabets.add("A");
        alphabets.add("B");
        alphabets.add("C");
        alphabets.add("D");
        alphabets.add("E");

        ArrayAdapter<String> alphabtersAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                alphabets
                );

        lstAlphabets.setAdapter(alphabtersAdapter);

        lstAlphabets.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Alphabets.this, GltfActivity.class);
                switch(alphabets.get(i)) {
                    case "A":
                        intent.putExtra("model", R.raw.a_alphabet_lore);
                        startActivity(intent);
                        break;
                    case "B":
                        intent.putExtra("model", R.raw.b);
                        startActivity(intent);
                        break;
                    case "C":
                        intent.putExtra("model", R.raw.c);
                        startActivity(intent);
                        break;
                    case "D":
                        intent.putExtra("model", R.raw.d);
                        startActivity(intent);
                        break;
                    case "E":
                        intent.putExtra("model", R.raw.e);
                        startActivity(intent);
                        break;
                    default:
                        break;
                }

            }
        });
    }
}

