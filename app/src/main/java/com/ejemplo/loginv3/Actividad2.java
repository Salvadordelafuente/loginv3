package app.ejemplo.loginv3;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ejemplo.loginv3.R;

import java.util.ArrayList;
import java.util.List;

public class Actividad2 extends AppCompatActivity {

    private RecyclerView recyclerViewPersona;
    private RecyclerViewAdaptador adaptadorPersona;;
    private ArrayAdapter arrayAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        recyclerViewPersona = (RecyclerView) findViewById(R.id.recyclerPersonas);
        recyclerViewPersona.setLayoutManager(new LinearLayoutManager(this));

        adaptadorPersona = new RecyclerViewAdaptador(obtenerPersonas());
        recyclerViewPersona.setAdapter(adaptadorPersona);

    }

    public List<PersonaModelo> obtenerPersonas(){
        List <PersonaModelo> persona = new ArrayList<>();
        persona.add(new PersonaModelo("1","Patricio","Gonzalez","984101381","Chevrolet","Camaro","",""));
        persona.add(new PersonaModelo("2","Tia","Silvia","Nissan","43513813","Silvia","","R.drawable.nissan"));
        persona.add(new PersonaModelo("3","Salvador","De la Fuente","","Audi","A3 RS","","R.drawable.audi"));
        persona.add(new PersonaModelo("4","Cristobal","Contreras","Mitsubishi","","Evo 7","","R.drawable.mitsubishi"));
        persona.add(new PersonaModelo("5","Jean","Veliz","","Mercedes","Cla 200","","R.drawable.mercedes"));
        persona.add(new PersonaModelo("6","Sebastian","Juarez","","Nissan","Primera","","R.drawable.nissan"));
        persona.add(new PersonaModelo("7","Jose","Renteria","","Audi","A4","","R.drawable.audi"));

        return persona;
    }
}