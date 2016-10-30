package com.julio.holamundo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Evaluar extends Activity implements View.OnClickListener {
    View boton,boton2,boton3;
    private EditText edt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluar);

        boton=findViewById(R.id.button8);
        boton.setOnClickListener(this);

        edt=(EditText)findViewById(R.id.editText5);

    }

    public void  onClick(View v){
        Intent intencion=new Intent(this,Doctor.class);
        if(v.getId()==R.id.button8){
            startActivity(intencion);

        }


    }
}
