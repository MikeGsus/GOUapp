package com.renovaciontabasco.gouapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.renovaciontabasco.gouapp.univ.UniversidadesActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enviaMensajeWhatsApp();
            }
        });


    }

    public void openUni(View view){
        Intent intent = new Intent(this, UniversidadesActivity.class);
        startActivity(intent);
    }

    public void openGal(View view){
        Intent intent = new Intent(this, GaleriaActivity.class);
        startActivity(intent);
    }

    public void openInfo(View view){
        Intent intent = new Intent(this, InformationActivity.class);
        startActivity(intent);
    }

    public void enviaMensajeWhatsApp() {
        Uri mUri = Uri.parse("smsto:9931727567");
        Intent mIntent = new Intent(Intent.ACTION_SENDTO, mUri);
        mIntent.setPackage("com.whatsapp");
        startActivity(mIntent);
    }

}
