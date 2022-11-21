package app.ejemplo.loginv3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.ejemplo.loginv3.R;

public class Actividad3 extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    String [] country = {"Chevrolet","Nissan","Mitsubishi","Audi","Mercedes"};
    private EditText ed_nombre,ed_apellido,ed_telefono,ed_modelo,ed_descripcion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad3);

        Spinner spin = (Spinner) findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);


        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item,country);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);

    }



    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void map (View mapa){
        Intent inte = new Intent(this, MapaActivity.class);
        startActivity(inte);
    }

}