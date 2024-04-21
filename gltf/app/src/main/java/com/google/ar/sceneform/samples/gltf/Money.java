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

public class Money extends AppCompatActivity {

    private ListView lstSubMenu;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.submenu);

        lstSubMenu = findViewById(R.id.lstSubMenu);

        ArrayList<String> currencies = new ArrayList<>();
        currencies.add("Euro");
        currencies.add("Dollar");
        currencies.add("Rupee");
        currencies.add("Yuan");
        currencies.add("Roman Coin");

        ArrayAdapter<String> currenciesAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                currencies);

        lstSubMenu.setAdapter(currenciesAdapter);

        lstSubMenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Money.this, GltfActivity.class);
                switch (currencies.get(i)) {
                    case "Euro":
                        intent.putExtra("model", R.raw.euro_coin);
                        startActivity(intent);
                        break;
                    case "Dollar":
                        intent.putExtra("model", R.raw.dollar);
                        startActivity(intent);
                        break;
                    case "Rupee":
                        intent.putExtra("model", R.raw.rupee_symbol_01);
                        startActivity(intent);
                        break;
                    case "Yuan":
                        intent.putExtra("model", R.raw.one_yuan_stack);
                        startActivity(intent);
                        break;
                    case "Roman Coin":
                        intent.putExtra("model", R.raw.roman_coin);
                        startActivity(intent);
                        break;
                    default:
                        break;
                }
            }
        });

    }
}
