package com.julio.holamundo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Doctor extends Activity implements View.OnClickListener {
    View boton,boton2,boton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_doctor);
        TextView mytextview=(TextView)findViewById(R.id.textView8);
        mytextview.setText("El doctor es:");

        boton=findViewById(R.id.imageView);
        boton.setOnClickListener(this);
        boton2=findViewById(R.id.imageView2);
        boton2.setOnClickListener(this);

    }
    public void  onClick(View v){
        Intent intencion=new Intent(this,MainActivity.class);
        Intent intencion2=new Intent(this,Malo.class);
        if(v.getId()==R.id.imageView){
            startActivity(intencion);

            Toast.makeText(this,"Gracias por tu opinion",Toast.LENGTH_SHORT).show();
        }
        if(v.getId()==R.id.imageView2) {
            startActivity(intencion2);
        }

    }
}