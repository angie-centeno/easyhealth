package com.julio.holamundo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Malo extends Activity implements View.OnClickListener {
    View boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malo);

        boton=findViewById(R.id.buttonM);
        boton.setOnClickListener(this);


    }
    public void  onClick(View v){
        Intent intencion=new Intent(this,MainActivity.class);
        if(v.getId()==R.id.buttonM){
            startActivity(intencion);

            Toast.makeText(this,"Gracias por tu opinion",Toast.LENGTH_SHORT).show();
        }


    }
}