package com.alex.helyer.mathe;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;

import com.alex.helyer.mathe.teoria.Algebra01Fragment;
import com.alex.helyer.mathe.teoria.DecimalesFragment;
import com.alex.helyer.mathe.teoria.EnterosFragment;
import com.alex.helyer.mathe.teoria.FactorizacionFragment;
import com.alex.helyer.mathe.teoria.FraccionariosFragment;
import com.alex.helyer.mathe.teoria.NaturalesFragment;

public class CursoTeoriaActivity extends AppCompatActivity {

    WebView web; //index.html

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Only PORTRAIT(Vertical)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        //FullScreen
        //requestWindowFeature(Window.FEATURE_ACTION_BAR);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_curso_teoria);

        getSupportActionBar().hide();

        Intent intent = getIntent();
        int opc = intent.getIntExtra("ID_subtema",-1);

        web = (WebView) findViewById(R.id.mywebsite);
        WebSettings webSettings = web.getSettings();
        webSettings.setJavaScriptEnabled(true);

        //Toast.makeText(this, "opc:"+opc, Toast.LENGTH_LONG).show();

        switch (opc) {
            case 0:
                web.loadUrl("file:///android_asset/tema00.html");
                //getSupportFragmentManager().beginTransaction().replace(R.id.teoria_content, new NaturalesFragment ()).commit();
                break;
            case 1:
                web.loadUrl("file:///android_asset/tema01.html");
                //getSupportFragmentManager().beginTransaction().replace(R.id.teoria_content, new EnterosFragment()).commit();
                break;
            case 2:
                web.loadUrl("file:///android_asset/tema02.html");
                //getSupportFragmentManager().beginTransaction().replace(R.id.teoria_content, new FraccionariosFragment()).commit();
                break;
            case 3:
                web.loadUrl("file:///android_asset/tema03.html");
                //getSupportFragmentManager().beginTransaction().replace(R.id.teoria_content, new DecimalesFragment()).commit();
                break;
            case 4:
                web.loadUrl("file:///android_asset/tema04.html");
                //getSupportFragmentManager().beginTransaction().replace(R.id.teoria_content, new Algebra01Fragment()).commit();
                break;
            case 5:
                web.loadUrl("file:///android_asset/tema05.html");
                //getSupportFragmentManager().beginTransaction().replace(R.id.teoria_content, new Algebra01Fragment()).commit();
                break;
            case 6:
                web.loadUrl("file:///android_asset/tema06.html");
                //getSupportFragmentManager().beginTransaction().replace(R.id.teoria_content, new FactorizacionFragment()).commit();
                break;
            case 7:
                web.loadUrl("file:///android_asset/tema07.html");
                //getSupportFragmentManager().beginTransaction().replace(R.id.teoria_content, new FactorizacionFragment()).commit();
                break;
            case 8:
                web.loadUrl("file:///android_asset/tema08.html");
                //getSupportFragmentManager().beginTransaction().replace(R.id.teoria_content, new FactorizacionFragment()).commit();
                break;
            case 9:
                web.loadUrl("file:///android_asset/tema09.html");
                //getSupportFragmentManager().beginTransaction().replace(R.id.teoria_content, new FactorizacionFragment()).commit();
                break;
            case 10:
                web.loadUrl("file:///android_asset/tema10.html");
                //getSupportFragmentManager().beginTransaction().replace(R.id.teoria_content, new FactorizacionFragment()).commit();
                break;
            case 11:
                web.loadUrl("file:///android_asset/tema11.html");
                //getSupportFragmentManager().beginTransaction().replace(R.id.teoria_content, new FactorizacionFragment()).commit();
                break;
            case 12:
                web.loadUrl("file:///android_asset/tema12.html");
                //getSupportFragmentManager().beginTransaction().replace(R.id.teoria_content, new FactorizacionFragment()).commit();
                break;
            case 13:
                web.loadUrl("file:///android_asset/tema13.html");
                //getSupportFragmentManager().beginTransaction().replace(R.id.teoria_content, new FactorizacionFragment()).commit();
                break;
            case 14:
                web.loadUrl("file:///android_asset/tema14.html");
                //getSupportFragmentManager().beginTransaction().replace(R.id.teoria_content, new FactorizacionFragment()).commit();
                break;
            case 15:
                web.loadUrl("file:///android_asset/tema15.html");
                //getSupportFragmentManager().beginTransaction().replace(R.id.teoria_content, new FactorizacionFragment()).commit();
                break;
            case 16:
                web.loadUrl("file:///android_asset/tema16.html");
                //getSupportFragmentManager().beginTransaction().replace(R.id.teoria_content, new FactorizacionFragment()).commit();
                break;
            case 17:
                web.loadUrl("file:///android_asset/tema17.html");
                //getSupportFragmentManager().beginTransaction().replace(R.id.teoria_content, new FactorizacionFragment()).commit();
                break;
            case 18:
                web.loadUrl("file:///android_asset/tema18.html");
                //getSupportFragmentManager().beginTransaction().replace(R.id.teoria_content, new FactorizacionFragment()).commit();
                break;
        }





    }
}
