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
    public double longitud;
    public double latitud;


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
                   numero = "9361147805";
                   latitud = 17.977018654063087;
                   longitud = -92.9549789428711;
                   return daca;
               case 1:
                   dacs dacs = new dacs();
                   numero = "9932214908";
                   latitud = 17.78571347947813;
                   longitud = -92.95549392700195;
                   return dacs;
               case 2:
                   dacsyh dacsyh = new dacsyh();
                   latitud = 18.00734548174369;
                   longitud = -92.92377948760986;
                   return dacsyh;
               case 3:
                   daea daea = new daea();
                   numero = "9932204328";
                   latitud = 18.01530387941711;
                   longitud = -92.98652172088623;
                   return daea;
               case 4:
                   daia daia = new daia();

                   return daia;
               case 5:
                   damc damc = new damc();
                   return damc;
               case 6:
                   damj damj = new damj();
                   numero = "9932841818";
                   return damj;
               case 7:
                   itech itech = new itech();
                   return itech;
               case 8:
                   itsce itsce = new itsce();
                   return itsce;
               case 9:
                   itss itss = new itss();
                   numero = "9321107850";
                   return itss;
               case 10:
                   itvh itvh = new itvh();
                   numero = "9931599997";
                   return itvh;
               case 11:
                   upn upn = new upn();
                   return upn;
               case 12:
                   uttab uttab = new uttab();
                   numero = "9932347482";
                   latitud = 17.809494877617688;
                   longitud = -92.92571067810059;
                   return uttab;
               default:
                   return null;
           }
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 13;
        }

    }

    public void enviaMensajeWhatsApp(String num) {
        Uri mUri = Uri.parse("smsto:"+num);
        Intent mIntent = new Intent(Intent.ACTION_SENDTO, mUri);
        mIntent.setPackage("com.whatsapp");
        startActivity(mIntent);
    }

    public void mostrarMapa(){
        Intent intent = new Intent(this, UbiActivity.class);
        UbiActivity.direccion(longitud,latitud);
        startActivity(intent);
    }

    public static void onActivityResult(int codigo1){
        codigo = codigo1;
    }
}
