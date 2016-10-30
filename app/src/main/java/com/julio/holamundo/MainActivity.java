package com.julio.holamundo;


import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class MainActivity extends Activity implements View.OnClickListener {
    View boton,boton2,boton3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton=findViewById(R.id.buttonr);
        boton.setOnClickListener(this);
        boton2=findViewById(R.id.button2);
        boton2.setOnClickListener(this);
        boton3=findViewById(R.id.button3);
        boton3.setOnClickListener(this);

    }
    public void  onClick(View v){
        Intent intencion=new Intent(this,Reserva.class);
        Intent intencion2=new Intent(this,Evaluar.class);
        Intent intencion3=new Intent(this,Medicina.class);
        if(v.getId()==R.id.buttonr){
            startActivity(intencion);

        }
        if(v.getId()==R.id.button2){
            startActivity(intencion2);
        }
        if (v.getId()==R.id.button3){
            startActivity(intencion3);
        }
    }
}