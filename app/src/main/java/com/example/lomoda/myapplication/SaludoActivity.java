package com.example.lomoda.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SaludoActivity extends AppCompatActivity {

    private TextView txtSaludo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);

    //Localizamos los controles
    txtSaludo=(TextView)findViewById(R.id.txtSaludo);

    //Recuperamos la informacion pasada en el intent
    Bundle bundle=this.getIntent().getExtras();

    //Y por ultimo asignamos el texto a la caja de texto nueva
    txtSaludo.setText("Hola, ¿Cómo estás "+ bundle.getString("NOMBRE")+"?");
    }
}
