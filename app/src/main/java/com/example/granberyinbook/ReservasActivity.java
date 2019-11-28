package com.example.granberyinbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ReservasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservas);
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
}
