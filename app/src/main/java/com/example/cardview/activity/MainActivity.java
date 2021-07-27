package com.example.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.cardview.R;
import com.example.cardview.adaptador.PostagemAdapter;
import com.example.cardview.model.Postagens;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagens> postagens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagens);

        //Define layout
        //RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        //LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //layoutManager.setOrientation(LinearLayout.HORIZONTAL);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerPostagem.setLayoutManager(layoutManager);

        //Define adapter
        prepararPostagens();
        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerPostagem.setAdapter(adapter);
    }

    public void prepararPostagens(){
            Postagens p = new Postagens("Fulano de Tal", "#tbt viagem bem legal!", R.drawable.imagem1);
            this.postagens.add(p);
            p = new Postagens("Ciclano de Tal", "Demais", R.drawable.imagem2);
            this.postagens.add(p);
            p = new Postagens("Beltrano de Tal", "Gostei dessa foto!", R.drawable.imagem3);
            this.postagens.add(p);
            p = new Postagens("Paulo de Tal", "#feliz", R.drawable.imagem4);
            this.postagens.add(p);
            p = new Postagens("Rafael de Tal", "Oi gente!", R.drawable.imagem1);
            this.postagens.add(p);
            p = new Postagens("Sivaldo de Tal", "Eita!", R.drawable.imagem3);
            this.postagens.add(p);
            p = new Postagens("Fatima de Tal", "Que lindo", R.drawable.imagem2);
            this.postagens.add(p);
    }
}
