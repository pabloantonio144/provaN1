package zica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.laboratorio.myapplication.R;

public class Questao2 extends AppCompatActivity {
    EditText nota1, nota2, nota3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao2);
        nota1 = (EditText) findViewById(R.id.N1);
        nota2 = (EditText) findViewById(R.id.N2);
        nota3 = (EditText) findViewById(R.id.N3);
    }

    public void enviarNota(View view) {
        String msg = "";
        Intent j;
        int n1 = Integer.valueOf(nota1.getText().toString());
        int n2 = Integer.valueOf(nota2.getText().toString());
        int n3 = Integer.valueOf(nota3.getText().toString());

        double media = (n1 + n2 + n3) / 3;

        if (media < 7){
            j = new Intent(this, Questao2Tela3.class);
            j.putExtra("media", media);
            startActivity(j);

        }else msg+= "Aprovado sem a necessidade de exame";

        Intent i = new Intent(this, Questao2Tela2.class);
        i.putExtra("resultado", msg);
        startActivity(i);


    }
}