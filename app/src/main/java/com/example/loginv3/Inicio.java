package com.example.loginv3;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class Inicio extends AppCompatActivity {

    TextView tvTexto;
    ProgressBar progressBar;
    int progreso = 0;
    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_inicio);

        Animation animacion1 = AnimationUtils.loadAnimation(this,R.anim.desplazamiento_arriba);
        Animation animacion2 = AnimationUtils.loadAnimation(this,R.anim.desplazamiento_abajo);

        TextView byTextView = findViewById(R.id.bytextView);
        TextView insaneTextView = findViewById(R.id.insanetextView2);
        ImageView inicioImageView = findViewById(R.id.inicioimageView);

        byTextView.setAnimation(animacion2);
        insaneTextView.setAnimation(animacion2);
        inicioImageView.setAnimation(animacion1);

        progressBar = findViewById(R.id.pbhorizontal);
        tvTexto = findViewById(R.id.tvTexto);

        new Thread(new Runnable() {
            @Override
            public void run() {

                while (progreso < 100){

                    progreso = progreso + 2;

                    handler.post(new Runnable() {
                        @Override
                        public void run() {

                            progressBar.setProgress(progreso);

                            if (progreso == 100){

                                Toast.makeText(Inicio.this,"Bienvenido", Toast.LENGTH_LONG).show();
                            }
                            tvTexto.setText(progreso + "/" + progressBar.getMax());
                        }
                    });
                    try {
                        Thread.sleep(200);

                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                Intent intent =new Intent(Inicio.this,MainActivity.class);
                startActivity(intent);
            }
        }).start();
    }
}
