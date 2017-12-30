package com.renovaciontabasco.gouapp.univ;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.renovaciontabasco.gouapp.R;

public class UniversidadesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_universidades);
    }

    public void openUT(View view){
        Intent intent = new Intent(this, universidad.class);
        startActivity(intent);
    }

    public void openUpn(View view){
        Intent intent = new Intent(this, universidad.class);
        startActivity(intent);
    }
}
