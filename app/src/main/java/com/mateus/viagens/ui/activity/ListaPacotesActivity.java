package com.mateus.viagens.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.mateus.viagens.DAO.PacoteDAO;
import com.mateus.viagens.R;
import com.mateus.viagens.ui.activity.model.Pacote;
import com.mateus.viagens.adapter.ListaPacotesAdapter;

import java.util.List;

public class ListaPacotesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_pacotes);
        ListView listaDePacotes = findViewById(R.id.lista_pacotes_listview);

        List<Pacote> pacotes = new PacoteDAO().lista();
        listaDePacotes.setAdapter(new ListaPacotesAdapter(pacotes, this
        ));
        setTitle("Pacotes");
    }
}