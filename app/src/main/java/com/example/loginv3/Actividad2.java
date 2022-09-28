package com.example.loginv3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Actividad2 extends AppCompatActivity {

    private RecyclerView recyclerViewPersona;
    private  RecyclerViewAdaptador adaptadorPersona;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        recyclerViewPersona=(RecyclerView)findViewById(R.id.recyclerPersonas);
        recyclerViewPersona.setLayoutManager(new LinearLayoutManager(this));

        adaptadorPersona = new RecyclerViewAdaptador(obtenerPersonas());
        recyclerViewPersona.setAdapter(adaptadorPersona);
    }


    public List<PersonaModelo> obtenerPersonas(){
        List <PersonaModelo> persona = new ArrayList<>();
        persona.add(new PersonaModelo("Patricio","Gonzalez","Chevrolet","Camaro",R.drawable.chevrolet));
        persona.add(new PersonaModelo("Tia","Silvia","Nissan","Silvia",R.drawable.nissan));
        persona.add(new PersonaModelo("Salvador","De la Fuente","Audi","A3 RS",R.drawable.audi));
        persona.add(new PersonaModelo("Cristobal","Contreras","Mitsubishi","Evo 7",R.drawable.mitsubishi));
        persona.add(new PersonaModelo("Jean","Veliz","Mercedes","Cla 200",R.drawable.mercedes));
        persona.add(new PersonaModelo("Sebastian","Juarez","Nissan","Primera",R.drawable.nissan));
        persona.add(new PersonaModelo("Jose","Renteria","Audi","A4",R.drawable.audi));
        persona.add(new PersonaModelo("Roberto","Gomez","Mitsubishi","Lancer",R.drawable.mitsubishi));
        persona.add(new PersonaModelo("Mauricio","Wuenceslao","Mercedes","AMG",R.drawable.mercedes));
        persona.add(new PersonaModelo("Maria","Riquelme","Audi","Q2",R.drawable.audi));
        persona.add(new PersonaModelo("Mario","Tiznado","Chevrolet","Corvette",R.drawable.chevrolet));
        persona.add(new PersonaModelo("Andres","Sepulveda","Chevrolet","Sail",R.drawable.chevrolet));
        persona.add(new PersonaModelo("Manuel","Artiaga","Mitsubishi","Montero",R.drawable.mitsubishi));
        persona.add(new PersonaModelo("Flor","Cespedes","Chevrolet","Spark",R.drawable.chevrolet));
        persona.add(new PersonaModelo("Felipe","Andrade","Nissan","Skiline",R.drawable.nissan));
        persona.add(new PersonaModelo("Alfonso","Ripetty","Chevrolet","Sonic",R.drawable.chevrolet));
        return persona;
    }
}