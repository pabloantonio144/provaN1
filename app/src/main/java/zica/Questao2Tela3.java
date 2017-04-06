package zica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.laboratorio.myapplication.R;

public class Questao2Tela3 extends AppCompatActivity {
    EditText exame;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao2_tela3);
        exame = (EditText) findViewById(R.id.edExame);


    }

    public void notaExame(View view) {

        String msg = "";
        int nota = Integer.valueOf(exame.getText().toString());
        String media = getIntent().getStringExtra("media");
        int nfinal = Integer.parseInt(("media" + nota / 2));

        if (nfinal >= 5){
            msg+= "Aprovado";
        }else
            msg+= "Reprovado";

        Intent i = new Intent(this, Questao2Tela2.class);
        i.putExtra("resultado", msg);
        startActivity(i);

    }
}