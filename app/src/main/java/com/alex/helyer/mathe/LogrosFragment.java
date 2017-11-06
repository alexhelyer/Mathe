package com.alex.helyer.mathe;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import de.hdodenhof.circleimageview.CircleImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class LogrosFragment extends Fragment {


    public LogrosFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_logros, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        GridView gridView = (GridView) getView().findViewById(R.id.gridview);
        gridView.setAdapter(new ImageAdapter(getActivity()));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(getActivity());
                switch (position) {
                    case 0:
                        AlertDialog.Builder alertDialog2 = new AlertDialog.Builder(getActivity());
                        alertDialog2.setMessage("¡Esta insignia va de nuestra parte!");
                        alertDialog2.setTitle("¡Hola!").show();
                        break;
                    case 1:
                        alertDialog.setMessage("Necesitas 100 puntos para desbloquear esta insignia");
                        alertDialog.setTitle("Ups").show();
                        break;
                    case 2:
                        alertDialog.setMessage("Necesitas 150 puntos para desbloquear esta insignia");
                        alertDialog.setTitle("Ups").show();
                        break;
                    case 3:
                        alertDialog.setMessage("Necesitas 200 puntos para desbloquear esta insignia");
                        alertDialog.setTitle("Ups").show();
                        break;
                    case 4:
                        alertDialog.setMessage("Necesitas 250 puntos para desbloquear esta insignia");
                        alertDialog.setTitle("Ups").show();
                        break;
                    case 5:
                        alertDialog.setMessage("Necesitas 300 puntos para desbloquear esta insignia");
                        alertDialog.setTitle("Ups").show();
                        break;
                    case 6:
                        alertDialog.setMessage("Necesitas 350 puntos para desbloquear esta insignia");
                        alertDialog.setTitle("Ups").show();
                        break;
                    case 7:
                        alertDialog.setMessage("Necesitas 400 puntos para desbloquear esta insignia");
                        alertDialog.setTitle("Ups").show();
                        break;
                    case 8:
                        alertDialog.setMessage("Necesitas 450 puntos para desbloquear esta insignia");
                        alertDialog.setTitle("Ups").show();
                        break;
                }

            }
        });

    }


    public class ImageAdapter extends BaseAdapter {
        private Context mContext;
        public int puntos = 100;

        public ImageAdapter(Context c){
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
                    R.mipmap.lannister,
                    R.mipmap.lannister,
                    R.mipmap.lannister,
                    R.mipmap.lannister,
                    R.mipmap.lannister,
                    R.mipmap.lannister,
                    R.mipmap.lannister,
                    R.mipmap.lannister,
                    R.mipmap.lannister
            };
            if(puntos >= 50) {
                misLogros = new Integer[]{
                        R.mipmap.house,
                        R.mipmap.lannister,
                        R.mipmap.lannister,
                        R.mipmap.lannister,
                        R.mipmap.lannister,
                        R.mipmap.lannister,
                        R.mipmap.lannister,
                        R.mipmap.lannister,
                        R.mipmap.lannister
                };
                return misLogros;
            }
            if(puntos >= 100) {
                misLogros = new Integer[]{
                        R.mipmap.house,
                        R.mipmap.house,
                        R.mipmap.lannister,
                        R.mipmap.lannister,
                        R.mipmap.lannister,
                        R.mipmap.lannister,
                        R.mipmap.lannister,
                        R.mipmap.lannister,
                        R.mipmap.lannister
                };
                return misLogros;
            }
            if(puntos >= 150) {
                misLogros = new Integer[]{
                        R.mipmap.house,
                        R.mipmap.house,
                        R.mipmap.house,
                        R.mipmap.lannister,
                        R.mipmap.lannister,
                        R.mipmap.lannister,
                        R.mipmap.lannister,
                        R.mipmap.lannister,
                        R.mipmap.lannister
                };
                return misLogros;
            }
            if(puntos >= 200) {
                misLogros = new Integer[]{
                        R.mipmap.house,
                        R.mipmap.house,
                        R.mipmap.house,
                        R.mipmap.house,
                        R.mipmap.lannister,
                        R.mipmap.lannister,
                        R.mipmap.lannister,
                        R.mipmap.lannister,
                        R.mipmap.lannister
                };
                return misLogros;
            }
            if(puntos >= 250) {
                misLogros = new Integer[]{
                        R.mipmap.house,
                        R.mipmap.house,
                        R.mipmap.house,
                        R.mipmap.house,
                        R.mipmap.house,
                        R.mipmap.lannister,
                        R.mipmap.lannister,
                        R.mipmap.lannister,
                        R.mipmap.lannister
                };
                return misLogros;
            }
            if(puntos >= 300) {
                misLogros = new Integer[]{
                        R.mipmap.house,
                        R.mipmap.house,
                        R.mipmap.house,
                        R.mipmap.house,
                        R.mipmap.house,
                        R.mipmap.house,
                        R.mipmap.lannister,
                        R.mipmap.lannister,
                        R.mipmap.lannister
                };
                return misLogros;
            }
            if(puntos >= 350) {
                misLogros = new Integer[]{
                        R.mipmap.house,
                        R.mipmap.house,
                        R.mipmap.house,
                        R.mipmap.house,
                        R.mipmap.house,
                        R.mipmap.house,
                        R.mipmap.house,
                        R.mipmap.lannister,
                        R.mipmap.lannister
                };
                return misLogros;
            }
            if(puntos >= 400) {
                misLogros = new Integer[]{
                        R.mipmap.house,
                        R.mipmap.house,
                        R.mipmap.house,
                        R.mipmap.house,
                        R.mipmap.house,
                        R.mipmap.house,
                        R.mipmap.house,
                        R.mipmap.house,
                        R.mipmap.lannister
                };
                return misLogros;
            }
            if(puntos >= 450) {
                misLogros = new Integer[]{
                        R.mipmap.house,
                        R.mipmap.house,
                        R.mipmap.house,
                        R.mipmap.house,
                        R.mipmap.house,
                        R.mipmap.house,
                        R.mipmap.house,
                        R.mipmap.house,
                        R.mipmap.house
                };
                return misLogros;
            }
            return misLogros;

        }
    }

}
