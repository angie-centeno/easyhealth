package com.julio.holamundo;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Agendar extends Activity  {
    View boton;private EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agendar);
        et1=(EditText)findViewById(R.id.editText2);
        et2=(EditText)findViewById(R.id.editText3);



    }

    public void consultacita(View v){
        AdminSQLiteOpenHelper admin=new AdminSQLiteOpenHelper(this,"agendar",null,1);
        SQLiteDatabase bd=admin.getWritableDatabase();
        String cod=et1.getText().toString();
        Cursor fila=bd.rawQuery("select fecha,hora from citas where curp="+cod,null);
        if(fila.moveToFirst()){
            et2.setText(fila.getString(0));
        }else
            Toast.makeText(this,"no existe una cita con dicho curp",Toast.LENGTH_SHORT).show();
        bd.close();
    }
    }
