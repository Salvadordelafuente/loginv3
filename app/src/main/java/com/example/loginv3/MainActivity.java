package com.example.loginv3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox seleccionarChk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seleccionarChk = ( CheckBox)findViewById(R.id.chkSeleccionar);
    }

    public void SiguienteACT (View v){
        Intent inte = new Intent(this,Actividad2.class);
        startActivity(inte);

    }

    public void formu (View form){
        Intent inte2 = new Intent(this,Actividad3.class);
        startActivity(inte2);

    }


    public void btnCheck (View v){

        if (seleccionarChk.isChecked()){
            String mensaje = "credenciales guardadas";
            Toast toast = Toast.makeText(this,mensaje,Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.START,90,0);
            toast.show();

        }
        else{
            String mensaje = "credenciales no guardadas";
            Toast.makeText(this,mensaje,Toast.LENGTH_LONG).show();
        }

    }

}