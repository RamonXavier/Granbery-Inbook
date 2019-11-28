package com.example.granberyinbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;

public class ListagemActivity extends AppCompatActivity {

    private EditText nome_l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listagem);
    }

    @Override
    public void onBackPressed() {
    // super.onBackPressed();
    // Not calling **super**, disables back button in current screen.
    }

    public void menuPrincipal(View view){
        Intent intentMenuP = new Intent(getApplicationContext(),MenuActivity.class);
        intentMenuP.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(intentMenuP);
        this.finish();
    }

    public void lerMais1(View view){
            String nomeLivro = "A droga da obediência";
            String autor = "Pedro Bandeira";
            String descricao = "O livro que iniciou a série com os Karas Uma turma de adolescentes enfrenta o mais diabólico dos crimes! Num clima de muito mistério e suspense, cinco estudantes";
            Integer id = 1;

            Intent enviar = new Intent(getApplicationContext(),DetalhesActivity.class);
            Bundle parametros = new Bundle();

            parametros.putString("key_nome", nomeLivro);
            parametros.putString("key_autor", autor);
            parametros.putString("key_desc", descricao);
            parametros.putInt("key_id", id);

            enviar.putExtras(parametros);
            enviar.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
            startActivity(enviar);
            this.finish();
    }

    public void lerMais2(View view){
        String nomeLivro = "Fogo em Roma";
        String autor = "Sidebottom,Harry";
        String descricao = "Em 255 D.C., o Império Romano mergulha em um processo irreversível de decadência e corrupção. Nesse momento de fragilidade, inimigos do Império ameaçam constantemente invadir suas fronteiras. Mas nenhum povo é mais temido do que o persa, liderado por Sapor, que se proclama o “Rei dos Reis” e tem como principal meta destruir Roma.";
        Integer id = 2;

        Intent enviar = new Intent(getApplicationContext(),DetalhesActivity.class);
        Bundle parametros = new Bundle();

        parametros.putString("key_nome", nomeLivro);
        parametros.putString("key_autor", autor);
        parametros.putString("key_desc", descricao);
        parametros.putInt("key_id", id);

        enviar.putExtras(parametros);
        enviar.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(enviar);
        this.finish();
    }

    public void lerMais3(View view){
        String nomeLivro = "O menino que caiu no buraco";
        String autor = "Ivan jaf";
        String descricao = "Um garoto de 13 anos passa por dificuldades emocionais porque seu pai está triste e não tem forças para levantar da cama há um ano.";
        Integer id = 3;

        Intent enviar = new Intent(getApplicationContext(),DetalhesActivity.class);
        Bundle parametros = new Bundle();

        parametros.putString("key_nome", nomeLivro);
        parametros.putString("key_autor", autor);
        parametros.putString("key_desc", descricao);
        parametros.putInt("key_id", id);

        enviar.putExtras(parametros);
        enviar.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(enviar);
        this.finish();
    }
}
