package com.alex.helyer.mathe;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.media.Image;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import de.hdodenhof.circleimageview.CircleImageView;

import static android.content.Context.MODE_PRIVATE;


/**
 * A simple {@link Fragment} subclass.
 */
public class InicioFragment extends Fragment {

    private TabLayout tabLayout;
    private ViewPager mViewPager;
    private ImageView settingsImage;
    private CircleImageView circleImageView;
    private ImageView ImageView1,ImageView2,ImageView3,ImageView4,ImageView5,ImageView6;
    private TextView puntos;


    public InicioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_inicio, container, false);

        mViewPager = (ViewPager) rootView.findViewById(R.id.iviewpager);

        puntos = (TextView) rootView.findViewById(R.id.mis_puntos);


        tabLayout = (TabLayout) rootView.findViewById(R.id.itabs);
        tabLayout.setupWithViewPager(mViewPager);

        setupViewPager(mViewPager);

        puntos.setText(""+getActivity().getSharedPreferences("PERFIL", MODE_PRIVATE).getInt("puntos",0));

        return rootView;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onResume() {
        super.onResume();
        ((AppCompatActivity) getActivity()).getSupportActionBar().show();
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Inicio");
        ((AppCompatActivity) getActivity()).getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimaryDark)));
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.acerca_menu, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            Intent intent = new Intent(getActivity(), ConfiguracionActivity.class);
            startActivity(intent);
        }
        else if (id == R.id.action_perfil) {
            Intent intent = new Intent(getActivity(), ModificarDatosActivity.class);
            startActivity(intent);
        }
        else if (id == R.id.action_logout) {
            getActivity().getSharedPreferences("SESSION", MODE_PRIVATE).edit().putInt("session_state",0).commit();
            Intent intent = new Intent(getActivity(),MainActivity.class);
            startActivity(intent);
            getActivity().finish();
        }
        return super.onOptionsItemSelected(item);
    }

    public void setupViewPager (ViewPager viewPager) {
        TabViewPagerAdapter adapter = new TabViewPagerAdapter(getChildFragmentManager());
        adapter.addFragment(new PerfilFragment(), "Perfil");
        adapter.addFragment(new EstadisticasFragment(), "Estadísticas");
        adapter.addFragment(new LogrosFragment(), "Logros");

        viewPager.setAdapter(adapter);
    }


    public void checkProfileImage(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
        int imageValue = getActivity().getSharedPreferences("ESTADISTICAS", Context.MODE_PRIVATE).getInt("imagen_perfil", 0);

        switch (imageValue){
            case 1:
                circleImageView.setImageResource(R.mipmap.sloth);
                break;
            case 2:
                circleImageView.setImageResource(R.mipmap.musk);
                break;
            case 3:
                circleImageView.setImageResource(R.mipmap.walrus);
                break;
            case 4:
                circleImageView.setImageResource(R.mipmap.wolf);
                break;
            case 5:
                circleImageView.setImageResource(R.mipmap.penguin);
                break;
            case 6:
                circleImageView.setImageResource(R.mipmap.ajolote);
                break;
        }
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //Check profile whats the current image profile
        circleImageView = (CircleImageView) getActivity().findViewById(R.id.profile_image);
        circleImageView.setImageResource(R.mipmap.sloth);
        checkProfileImage();


        final AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.image_profile_container, null);

        ImageView1 = (ImageView)dialogView.findViewById(R.id.image_profile1);
        ImageView2 = (ImageView)dialogView.findViewById(R.id.image_profile2);
        ImageView3 = (ImageView)dialogView.findViewById(R.id.image_profile3);
        ImageView4 = (ImageView)dialogView.findViewById(R.id.image_profile4);
        ImageView5 = (ImageView)dialogView.findViewById(R.id.image_profile5);
        ImageView6 = (ImageView)dialogView.findViewById(R.id.image_profile6);

        dialogBuilder.setView(dialogView);
        final AlertDialog alertDialog = dialogBuilder.create();






        circleImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.setTitle("¡Cambia tu imagen de perfil!");
                alertDialog.show();
                //alertDialog.getWindow().setLayout(500,600);

                ImageView1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        getActivity().getSharedPreferences("ESTADISTICAS", Context.MODE_PRIVATE).edit().putInt("imagen_perfil", 1).apply();
                        circleImageView.setImageResource(R.mipmap.sloth);
                    }
                });
                ImageView2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        getActivity().getSharedPreferences("ESTADISTICAS", Context.MODE_PRIVATE).edit().putInt("imagen_perfil", 2).apply();
                        circleImageView.setImageResource(R.mipmap.musk);
                    }
                });
                ImageView3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        getActivity().getSharedPreferences("ESTADISTICAS", Context.MODE_PRIVATE).edit().putInt("imagen_perfil", 3).apply();
                        circleImageView.setImageResource(R.mipmap.walrus);
                    }
                });
                ImageView4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        getActivity().getSharedPreferences("ESTADISTICAS", Context.MODE_PRIVATE).edit().putInt("imagen_perfil", 4).apply();
                        circleImageView.setImageResource(R.mipmap.wolf);
                    }
                });
                ImageView5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        getActivity().getSharedPreferences("ESTADISTICAS", Context.MODE_PRIVATE).edit().putInt("imagen_perfil", 5).apply();
                        circleImageView.setImageResource(R.mipmap.penguin);
                    }
                });
                ImageView6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        getActivity().getSharedPreferences("ESTADISTICAS", Context.MODE_PRIVATE).edit().putInt("imagen_perfil", 6).apply();
                        circleImageView.setImageResource(R.mipmap.ajolote);
                    }
                });

            }
        });

        //**********    Settings    **********//
        settingsImage = (ImageView)getActivity().findViewById(R.id.settins_boton);
        settingsImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getActivity(),"Settings",Toast.LENGTH_SHORT).show();
                Intent intent;
                intent = new Intent(getActivity(), ModificarDatosActivity.class);
                startActivity(intent);

            }
        });

    }


}
