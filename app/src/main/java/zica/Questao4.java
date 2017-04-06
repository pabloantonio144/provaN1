package zica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.laboratorio.myapplication.R;

public class Questao4 extends AppCompatActivity {
    RadioGroup escolha;
    EditText altura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao4);

        altura = (EditText) findViewById(R.id.altura);
        escolha = (RadioGroup) findViewById(R.id.escolha);
    }
    public void  Q4 (View view){
        double alt = Double.parseDouble(altura.getText().toString());
        double res = 0;
        double esc = 0;

        if(escolha.getCheckedRadioButtonId() == R.id.masculino){
            esc = 4;
            res = (alt - 100) - ((alt - 150) / esc);
            mensagem(" é "+res);
        }
        if (escolha.getCheckedRadioButtonId() == R.id.feminino){
            esc = 2;
            res = (alt - 100) - ((alt - 150) / esc);
            mensagem(" é "+res);
        }
    }

    private void mensagem(String s) {
        Toast.makeText(Questao4.this, s, Toast.LENGTH_SHORT).show();
        Log.i("App",s);
    }


}

