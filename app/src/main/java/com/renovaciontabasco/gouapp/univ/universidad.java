package com.renovaciontabasco.gouapp.univ;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.renovaciontabasco.gouapp.R;
import com.renovaciontabasco.gouapp.UbiActivity;

public class universidad extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;
    static int codigo;
    static String numero;
    static double longitud;
    static double latitud;


    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private static ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_universidad);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        mViewPager.setCurrentItem(codigo);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enviaMensajeWhatsApp(numero);
            }
        });

        FloatingActionButton tomap = (FloatingActionButton) findViewById(R.id.ToMap);
        tomap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrarMapa();
            }
        });

    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
               case 0:
                   daca daca = new daca();
                   pestañas();
                   return daca;
               case 1:
                   dacs dacs = new dacs();
                   pestañas();
                   return dacs;
               /*case 2:
                   dacsyh dacsyh = new dacsyh();
                   return dacsyh;
               case 3:
                   daea daea = new daea();
                   return daea;
               case 4:
                   daia daia = new daia();
                   return daia;*/
               case 2:
                   damc damc = new damc();
                   pestañas();
                   return damc;
               case 3:
                   damj damj = new damj();
                   pestañas();
                   return damj;
               /*case 7:
                   itech itech = new itech();
                   return itech;
               case 8:
                   itsce itsce = new itsce();
                   return itsce;*/
               case 4:
                   itss itss = new itss();
                   pestañas();
                   return itss;
               case 5:
                   itvh itvh = new itvh();
                   pestañas();
                   return itvh;
               /*case 11:
                   upn upn = new upn();
                   return upn;*/
               case 6:
                   uttab uttab = new uttab();
                   pestañas();
                   return uttab;
                default:
                    return null;
           }
        }

        @Override
        public int getCount() {
            // Show 7 total pages.
            return 7;
        }

    }

    public void enviaMensajeWhatsApp(String num) {
        for (int i = 0; i < 2; i++){
            pestañas();
            if (i == 1){
                Uri mUri = Uri.parse("smsto:"+numero);
                Intent mIntent = new Intent(Intent.ACTION_SENDTO, mUri);
                mIntent.setPackage("com.whatsapp");
                startActivity(mIntent);
            }
        }
    }

    public void mostrarMapa(){
        for (int i = 0; i < 2; i++){
            pestañas();
            if (i == 1){
                Intent intent = new Intent(this, UbiActivity.class);
                UbiActivity.direccion(longitud,latitud);
                startActivity(intent);
            }
        }
    }

    public static void onActivityResult(int codigo1){
        codigo = codigo1;
    }

    public static void pestañas(){
        System.out.println(mViewPager.getCurrentItem());
        numero = "";
        latitud = 0;
        longitud = 0;
        try {
            switch (mViewPager.getCurrentItem()){
                case 0:
                    numero = "9361147805";
                    latitud = 17.572203;
                    longitud = -92.956814;
                    break;
                case 1:
                    numero = "9931727567";
                    latitud = 17.975929;
                    longitud = -92.953353;
                    break;
                case 2:
                    numero = "9231093996";
                    latitud = 18.226486;
                    longitud = -93.231273;
                    break;
                case 3:
                    numero = "9932841818";
                    latitud = 18.178838;
                    longitud = -93.043433;
                    break;
                case 4:
                    numero = "9321107850";
                    latitud = 17.546550;
                    longitud = -92.911232;
                    break;
                case 5:
                    numero = "9931599997";
                    latitud = 18.022933;
                    longitud = -92.903559;
                    break;
                case 6:
                    numero = "9932617686";
                    latitud = 17.884516234124536;
                    longitud = -92.92358636856079;
                    break;
                default:
                    break;
            }
        }catch (Exception error){
            System.out.println(error);
        }

    }
}
