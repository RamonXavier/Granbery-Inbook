package com.example.granberyinbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    @Override
    public void onBackPressed() {
    // super.onBackPressed();
    // Not calling **super**, disables back button in current screen.
    }

    public void sairSist(View view){
        Intent intentSair = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intentSair);
    }
    public void openListagem(View view){
        Intent intentListagem = new Intent(getApplicationContext(),ListagemActivity.class);
        intentListagem.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(intentListagem);
        this.finish();
    }

    public void openReservas(View view){
        Intent intentReserva = new Intent(getApplicationContext(),ReservasActivity.class);
        intentReserva.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(intentReserva);
        this.finish();
    }

    public void openFavoritos(View view){
        Intent intentFavoritos = new Intent(getApplicationContext(),FavoritosActivity.class);
        intentFavoritos.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(intentFavoritos);
        this.finish();
    }
}
