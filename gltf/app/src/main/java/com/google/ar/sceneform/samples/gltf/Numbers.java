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

public class Numbers extends AppCompatActivity {

    private ListView lstNumbers;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shapes);

        lstNumbers = findViewById(R.id.lstShapes);

        ArrayList<String> numbers = new ArrayList<>();
        numbers.add("0");
        numbers.add("1");
        numbers.add("2");
        numbers.add("3");
        numbers.add("4");
        numbers.add("5");
        numbers.add("6");
        numbers.add("7");
        numbers.add("8");
        numbers.add("9");

        ArrayAdapter<String> numbersAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                numbers);

        lstNumbers.setAdapter(numbersAdapter);

        lstNumbers.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Numbers.this, GltfActivity.class);
                switch(numbers.get(i)) {
                    case "0":
                        intent.putExtra("model", R.raw.zero);
                        startActivity(intent);
                        break;
                    case "1":
                        intent.putExtra("model", R.raw.one);
                        startActivity(intent);
                        break;
                    case "2":
                        intent.putExtra("model", R.raw.two);
                        startActivity(intent);
                        break;
                    case "3":
                        intent.putExtra("model", R.raw.three);
                        startActivity(intent);
                        break;
                    case "4":
                        intent.putExtra("model", R.raw.four);
                        startActivity(intent);
                        break;
                    case "5":
                        intent.putExtra("model", R.raw.five);
                        startActivity(intent);
                        break;
                    case "6":
                        intent.putExtra("model", R.raw.six);
                        startActivity(intent);
                        break;
                    case "7":
                        intent.putExtra("model", R.raw.seven);
                        startActivity(intent);
                        break;
                    case "8":
                        intent.putExtra("model", R.raw.eight);
                        startActivity(intent);
                        break;
                    case "9":
                        intent.putExtra("model", R.raw.nine);
                        startActivity(intent);
                        break;

                }
            }
        });

    }
}
