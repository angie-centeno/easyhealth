package com.julio.holamundo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Medicina extends Activity implements View.OnClickListener {
        View boton,boton2,boton3;

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicina);

        boton=findViewById(R.id.button7);
        boton.setOnClickListener(this);


        }
public void  onClick(View v){
        Intent intencion=new Intent(this,Mapa.class);
        if(v.getId()==R.id.button7){
        startActivity(intencion);

        }

        }
        class Ejecuta{
                EditText etc=(EditText)findViewById(R.id.editText4);
                int n=Integer.parseInt(etc.toString());


        }
        }