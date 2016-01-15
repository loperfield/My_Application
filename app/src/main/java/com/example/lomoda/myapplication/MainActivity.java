package com.example.lomoda.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText txtNombre;
    private Button btnAceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre= (EditText)findViewById(R.id.txtNombre);
        btnAceptar= (Button)findViewById(R.id.btnAceptar);

        btnAceptar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // creamos el intend
                Intent intent = new Intent(MainActivity.this, SaludoActivity.class);

                // Creamos la informacion a pasar entre las actividades
                Bundle b = new Bundle();

                b.putString("NOMBRE", txtNombre.getText().toString());

                //Añadimos la información al intend
                intent.putExtras(b);

                //Iniciamos la nueva actividad
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id= item.getItemId();

        //noinspection SimplifiableIfStatement
        if(id==R.id.action_settings){
            return true;}

        return super.onOptionsItemSelected(item);
    }
}
