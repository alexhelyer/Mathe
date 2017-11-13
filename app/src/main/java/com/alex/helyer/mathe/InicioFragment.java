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
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import de.hdodenhof.circleimageview.CircleImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class InicioFragment extends Fragment {

    private TabLayout tabLayout;
    private ViewPager mViewPager;
    private ImageView settingsImage;
    private CircleImageView circleImageView;


    public InicioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_inicio, container, false);

        mViewPager = (ViewPager) rootView.findViewById(R.id.iviewpager);

        tabLayout = (TabLayout) rootView.findViewById(R.id.itabs);
        tabLayout.setupWithViewPager(mViewPager);

        setupViewPager(mViewPager);

        return rootView;
    }

    @Override
    public void onResume() {
        super.onResume();
        ((AppCompatActivity) getActivity()).getSupportActionBar().show();
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Inicio");
        ((AppCompatActivity) getActivity()).getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimaryDark)));
    }

    public void setupViewPager (ViewPager viewPager) {
        TabViewPagerAdapter adapter = new TabViewPagerAdapter(getChildFragmentManager());
        adapter.addFragment(new PerfilFragment(), "Perfil");
        adapter.addFragment(new EstadisticasFragment(), "Estadísticas");
        //adapter.addFragment(new LogrosFragment(), "Logros");

        viewPager.setAdapter(adapter);
    }

    public static Bitmap generateBorders(ImageView imageView){
        Bitmap mbitmap = ((BitmapDrawable) imageView.getDrawable()).getBitmap();
        Bitmap imageRounded = Bitmap.createBitmap(mbitmap.getWidth(), mbitmap.getHeight(), mbitmap.getConfig());
        Canvas canvas = new Canvas(imageRounded);
        Paint mpaint = new Paint();
        mpaint.setAntiAlias(true);
        mpaint.setShader(new BitmapShader(mbitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
        canvas.drawRoundRect((new RectF(0, 0, mbitmap.getWidth(), mbitmap.getHeight())), 100, 100, mpaint);// Round Image Corner 100 100 100 100
        return imageRounded;
    }

    public void checkProfileImage(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
        int imageValue = preferences.getInt("imageValue", 0);

        switch (imageValue){
            case 0:
                circleImageView.setImageResource(R.mipmap.alberteinstein);
                break;
            case 1:
                circleImageView.setImageResource(R.mipmap.tesla);
                break;
            case 2:
                circleImageView.setImageResource(R.mipmap.house);
                break;
        }
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //Check profile whats the current image profile
        circleImageView = (CircleImageView) getActivity().findViewById(R.id.profile_image);
        circleImageView.setImageResource(R.mipmap.alberteinstein);
        checkProfileImage();


        final AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.image_profile_container, null);
        dialogBuilder.setView(dialogView);
        final AlertDialog alertDialog = dialogBuilder.create();
        final GridView gridView = (GridView) dialogView.findViewById(R.id.gridviewProfile);
        gridView.setAdapter(new ImageProfileAdapter(getActivity()));

        circleImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.setTitle("¡Cambia tu imagen de perfil!");
                alertDialog.show();
                //alertDialog.getWindow().setLayout(500,600);
                gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        AlertDialog.Builder alertDialog = new AlertDialog.Builder(getActivity());
                        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
                        SharedPreferences.Editor imageValue = preferences.edit();

                        switch (position) {
                            case 0:
                                imageValue.putInt("imageValue",0);
                                circleImageView.setImageResource(R.mipmap.alberteinstein);
                                break;
                            case 1:
                                imageValue.putInt("imageValue",1);
                                circleImageView.setImageResource(R.mipmap.tesla);
                                break;
                            case 2:
                                imageValue.putInt("imageValue",2);
                                circleImageView.setImageResource(R.mipmap.house);
                                break;
                            case 3:
                                circleImageView.setImageResource(R.mipmap.tesla);
                                break;
                            case 4:
                                circleImageView.setImageResource(R.mipmap.tesla);
                                break;
                            case 5:
                                circleImageView.setImageResource(R.mipmap.tesla);
                                break;
                            case 6:
                                circleImageView.setImageResource(R.mipmap.tesla);
                                break;
                        }

                        imageValue.apply();
                    }
                });

            }
        });

        //**********    Settings    **********//
        settingsImage = (ImageView)getActivity().findViewById(R.id.settins_boton);
        settingsImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Settings",Toast.LENGTH_SHORT).show();
                Intent intent;
                intent = new Intent(getActivity(), ModificarDatosActivity.class);
                startActivity(intent);

            }
        });

    }

    public void customAlertDialog(){

    }


    public class ImageProfileAdapter extends BaseAdapter {
        private Context mContext;
        public int puntos = 100;

        public ImageProfileAdapter(Context c){
            mContext = c;
        }

        public int getCount(){
            return Insignia().length;
        }

        public Object getItem(int position){
            return null;
        }

        public long getItemId(int position){
            return 0;
        }

        public View getView(int position, View convertView, ViewGroup parent){
            CircleImageView circleImageView = new CircleImageView(mContext);
            circleImageView.setLayoutParams(new GridView.LayoutParams(85,85));
            circleImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            circleImageView.setPadding(8,8,8,8);
            circleImageView.setImageResource(Insignia()[position]);
            return circleImageView;
        }

        public Integer[] Insignia(){
            Integer[] misLogros = {
                    R.mipmap.alberteinstein,
                    R.mipmap.tesla,
                    R.mipmap.tesla,
                    R.mipmap.tesla,
                    R.mipmap.tesla,
                    R.mipmap.tesla
            };

            return misLogros;
        }
    }

}
