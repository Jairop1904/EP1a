package com.uisrael.ep1a;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class resultado extends AppCompatActivity {

    private TextView tvresultado;//

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        //Enlace del objeto tv_resultado para que reciba datos
        tvresultado =findViewById(R.id.tv_resultado);
        String resultado = getIntent().getStringExtra("");

        //Asignacion de datos al objeto tv_resultado en el activiti_resultado
        tvresultado.setText(resultado);

    }

    //Metodo que permite regresar a la activity principal
    public  void regresar(View view){
        //Creamis un objeto que permita el regreso al Main activity
        Intent regresar = new Intent(this,MainActivity.class);
        startActivity(regresar);
    }


}
