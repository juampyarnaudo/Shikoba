package com.example.shikoba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listaDatos;
    ArrayList <Datos> Lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaDatos = (ListView) findViewById(R.id.mlvDatos);
        Lista = new ArrayList<Datos>();
        Lista.add(new Datos(1, "Foto 1", "Este animal es de la foto 1",R.drawable.ic_launcher_background ));

        Adaptador mAdapter = new Adaptador(getApplicationContext(),Lista);
        listaDatos.setAdapter(mAdapter);

    }
}
