package com.example.sandwichclub;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Cat murzik = new Cat(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView Cats = findViewById(R.id.Cats);
        Cats.setText("Кот: " +murzik.name + ", " + murzik.age + " лет," + "цвет:"+ murzik.color);
        View view = findViewById(R.id.view);
        view.setBackgroundColor(murzik.color);
    }
}