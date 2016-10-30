package com.julio.holamundo;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Reserva extends Activity  implements View.OnClickListener {
    View boton;private EditText et1,et2,et3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserva);
        et1=(EditText)findViewById(R.id.editText);
        boton=findViewById(R.id.buttonr);
        boton.setOnClickListener(this);
        et3=(EditText)findViewById(R.id.editText2);
        et2=(EditText)findViewById(R.id.editText3);




    }
    public void  onClick(View v){
        Intent intencion=new Intent(this, MainActivity.class);
        if(v.getId()==R.id.buttonr){
            startActivity(intencion);

        }
        AdminSQLiteOpenHelper admin =new AdminSQLiteOpenHelper(this,"agendar",null,1);
        SQLiteDatabase bd=admin.getWritableDatabase();
        String cod=et1.getText().toString();
        String fecha=et2.getText().toString();
        String hora=et3.getText().toString();
        ContentValues registro=new ContentValues();
        registro.put("curp",cod);
        registro.put("fecha",fecha);
        registro.put("hora",hora);
        bd.insert("citas",null,registro);
        bd.close();
        et1.setText("");
        et2.setText("");
        et3.setText("");
        Toast.makeText(this,"Se cargaron los datos de tu cita",Toast.LENGTH_SHORT).show();

    } public void consultacita(View v){
        AdminSQLiteOpenHelper admin=new AdminSQLiteOpenHelper(this,"agendar",null,1);
        SQLiteDatabase bd=admin.getWritableDatabase();
        String cod=et1.getText().toString();
        Cursor fila=bd.rawQuery("select fecha,hora from citas where curp="+cod,null);
        if(fila.moveToFirst()){
            et2.setText(fila.getString(0));
            et3.setText(fila.getString(1));
        }else
            Toast.makeText(this,"no existe una cita con dicho curp",Toast.LENGTH_SHORT).show();
        bd.close();
    }
}

