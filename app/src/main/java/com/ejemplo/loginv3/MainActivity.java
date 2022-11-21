package app.ejemplo.loginv3;

import android.content.Intent;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.ejemplo.loginv3.R;

public class MainActivity extends AppCompatActivity {
    private CheckBox seleccionarChk;
    SensorManager sensorManager;
    Sensor sensor;
    SensorEventListener sensorEventListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seleccionarChk = (CheckBox)findViewById(R.id.chkSeleccionar);
        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY);

        if (sensor==null)
            finish();

        sensorEventListener=new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent sensorEvent) {
                if (sensorEvent.values[0]<sensor.getMaximumRange()){
                    getWindow().getDecorView().setBackgroundColor(Color.CYAN);
                }else {
                    getWindow().getDecorView().setBackgroundColor(Color.BLACK);
                }
            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int accuracy) {

            }
        };
        star();

    }
    public void star(){
        sensorManager.registerListener(sensorEventListener,sensor,2000*1000);
    }
    public void stop(){
        sensorManager.unregisterListener(sensorEventListener);
    }

    @Override
    protected void onPause() {
        stop();
        super.onPause();
    }

    @Override
    protected void onResume() {
        star();
        super.onResume();
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