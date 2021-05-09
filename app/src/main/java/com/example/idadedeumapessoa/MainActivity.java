package com.example.idadedeumapessoa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    EditText anoNascimento;
    TextView anoActual;
    TextView idadeActual;
    TextView idade2050;
    Button calcular;
    Calendar cal = Calendar.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anoNascimento = (EditText) findViewById(R.id.editTextTextPersonName);
        anoActual = (TextView) findViewById(R.id.textView);
        idadeActual = (TextView) findViewById(R.id.textView4);
        idade2050 = (TextView) findViewById(R.id.textView6);
        calcular = (Button) findViewById(R.id.button);

        calcular.setOnClickListener(c->{
            anoActual.setText(Integer.toString(cal.get(Calendar.YEAR)));

            int idadeAgora, idadeFutura;

            idadeAgora = Integer.parseInt(anoActual.getText().toString()) - Integer.parseInt(anoNascimento.getText().toString());
            idadeFutura = 2050 - Integer.parseInt(anoNascimento.getText().toString());

            idadeActual.setText(Integer.toString(idadeAgora));
            idade2050.setText(Integer.toString(idadeFutura));
        });
    }
}