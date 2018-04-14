package com.renovaciontabasco.gouapp.univ;

import android.app.Fragment;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.renovaciontabasco.gouapp.univ.universidad;
import com.renovaciontabasco.gouapp.R;

public class UniversidadesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_universidades);
    }

    public void openUT(View view){
        Intent intent = new Intent(this, universidad.class);
        universidad.onActivityResult(6);
        startActivity(intent);
    }

    public void openUpn(View view){
        Intent intent = new Intent(this, universidad.class);
        universidad.onActivityResult(11);
        startActivity(intent);
    }

    public void openItvh(View view){
        Intent intent = new Intent(this, universidad.class);
        universidad.onActivityResult(5);
        startActivity(intent);
    }

    public void openItss(View view){
        Intent intent = new Intent(this, universidad.class);
        universidad.onActivityResult(4);
        startActivity(intent);
    }

    public void openItsce(View view){
        Intent intent = new Intent(this, universidad.class);
        universidad.onActivityResult(8);
        startActivity(intent);
    }

    public void openItech(View view){
        Intent intent = new Intent(this, universidad.class);
        universidad.onActivityResult(7);
        startActivity(intent);
    }

    public void openDamj(View view){
        Intent intent = new Intent(this, universidad.class);
        universidad.onActivityResult(3);
        startActivity(intent);
    }

    public void openDamc(View view){
        Intent intent = new Intent(this, universidad.class);
        universidad.onActivityResult(2);
        startActivity(intent);
    }

    public void openDaia(View view){
        Intent intent = new Intent(this, universidad.class);
        universidad.onActivityResult(4);
        startActivity(intent);
    }

    public void openDaea(View view){
        Intent intent = new Intent(this, universidad.class);
        universidad.onActivityResult(3);
        startActivity(intent);
    }

    public void openDacsyh(View view){
        Intent intent = new Intent(this, universidad.class);
        universidad.onActivityResult(2);
        startActivity(intent);
    }

    public void openDacs(View view){
        Intent intent = new Intent(this, universidad.class);
        universidad.onActivityResult(1);
        startActivity(intent);
    }

    public void openDaca(View view){
        Intent intent = new Intent(this, universidad.class);
        universidad.onActivityResult(0);
        startActivity(intent);
    }
}
