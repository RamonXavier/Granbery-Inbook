package com.example.granberyinbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalhesActivity extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        // super.onBackPressed();
        // Not calling **super**, disables back button in current screen.
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);

        Intent receber = getIntent();
        Bundle parametros = receber.getExtras();

        if(parametros != null){
            String nome_livro = parametros.getString("key_nome");
            String autor = parametros.getString("key_autor");
            String descricao = parametros.getString("key_desc");
            Integer id_livro = parametros.getInt("key_id");

            TextView name = (TextView) findViewById(R.id.nomeLivro);
            name.setText(nome_livro);

            TextView autor_escritor = (TextView) findViewById(R.id.autorLivro);
            autor_escritor .setText(autor);

            TextView desc = (TextView) findViewById(R.id.descricaoLivro);
            desc.setText(descricao);

            if(id_livro.equals(1)){
                ImageView myImage = (ImageView) findViewById(R.id.livro_img);
                myImage.setImageDrawable(getResources().getDrawable(R.drawable.l1));
            }
            if (id_livro.equals(2)){
                ImageView myImage = (ImageView) findViewById(R.id.livro_img);
                myImage.setImageDrawable(getResources().getDrawable(R.drawable.l2));
            }
            if (id_livro.equals(3)){
                ImageView myImage = (ImageView) findViewById(R.id.livro_img);
                myImage.setImageDrawable(getResources().getDrawable(R.drawable.l3));
            }
        }
    }

    public void menuPrincipal(View view){
        Intent intentMenuP = new Intent(getApplicationContext(),MenuActivity.class);
        intentMenuP.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(intentMenuP);
        this.finish();
    }

    public void openListagem(View view){
        Intent intentListagem = new Intent(getApplicationContext(),ListagemActivity.class);
        intentListagem.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(intentListagem);
        this.finish();
    }
}
