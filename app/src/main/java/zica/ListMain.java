package zica;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListMain extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        String[] values = new String[]{"Questão 1", "Questão 2", "Questão 3", "Questão 4"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values);
        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        String item = (String) getListAdapter().getItem(position);
        Toast.makeText(this, item + " selected", Toast.LENGTH_SHORT).show();

        Intent i;
        switch (item) {
            case "Questão 1":
                i = new Intent(this, Questao1.class);
                startActivity(i);
                break;
            case "Questão 2":
                i = new Intent(this, Questao2.class);
                startActivity(i);
                break;
            case "Questão 3":
                i = new Intent(this, Questao3.class);
                startActivity(i);
                break;
            case "Questão 4":
                i = new Intent(this, Questao4.class);
                startActivity(i);
                break;

        }
    }
}