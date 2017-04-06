package zica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.laboratorio.myapplication.R;

public class Questao2Tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao2_tela2);
        String msg = getIntent().getStringExtra("resultado");
        TextView textResultado =
                (TextView) findViewById(R.id.textResultado);

        textResultado.setText(msg);
    }
}
