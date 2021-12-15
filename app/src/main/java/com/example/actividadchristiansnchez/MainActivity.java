package com.example.actividadchristiansnchez;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.example.actividadchristiansnchez.Adaptadores.ImageGaleryAdapter;

public class MainActivity extends AppCompatActivity {
    GridView gridViewImages;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Theme_ActividadChristianSánchez);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridViewImages = findViewById(R.id.grid_view_images);
        gridViewImages.setAdapter(new ImageGaleryAdapter(this));
    }
}