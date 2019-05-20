package com.uisrael.ep1a;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Varible para llenar la opciones del spinner
    private Spinner ob_spinner;
    private TextView ob_valor1;
    private TextView ob_valor2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Asignar la variable del Spinner al objeto
        ob_spinner = (Spinner) findViewById(R.id.sp_opciones);
        ob_valor1 = (EditText) findViewById(R.id.et_valor1);
        ob_valor2 = (EditText) findViewById(R.id.et_valor2);

        //Asignar los valores al spiner para seleccionar
        String[] opciones = {"Suma", "Resta", "Multiplicacion", "Division"};
        ArrayAdapter<String> objeto_adapter = new ArrayAdapter<String>(this, R.layout.sppiner_opciones, opciones);
        ob_spinner.setAdapter(objeto_adapter);

    }

    public void Calcular(){
        //se carga en variables los contenidos de los textos.
        String v_opciones = ob_spinner.getSelectedItem().toString();
        Double v_valor1 = Double.parseDouble(ob_valor1.getText().toString());
        Double v_valor2 = Double.parseDouble(ob_valor2.getText().toString());
        Double v_resultado = 0.0;

        //Se revisa que opcion escogio y en funcion a ello se realiza la operacion deseada.
        switch(v_opciones){
            case "Suma":
                //Para la suma
                v_resultado = v_valor1+v_valor2;
                break;
            case "Resta":
                //Do this and this
                v_resultado = v_valor1-v_valor2;
                break;
            case "Multiplicacion":
                //Do this and this:
                v_resultado = v_valor1*v_valor2;
                break;
            case "Division":
                //Do this and this:
                if(v_valor1!=0 && v_valor2!=0) {
                    v_resultado = v_valor1 + v_valor2;
                }else{
                    String v_mensaje = "Indeterminado";
                }
                break;
            default: //For all other cases, do this
                break;
        }

        //se pasa los parametros a la activity d resultado
        //Se crea el ovjeto para los activity con parametros (1a Activty, 2a Activty)
        Intent act_resutado = new Intent(this, resultado.class);
        //Se pasa os datos a la activity resultado
        act_resutado.putExtra("resultado",v_resultado.toString());
        //Se llama a la siguiente activity
        startActivity(act_resutado);

    }
}
