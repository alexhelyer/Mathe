package com.alex.helyer.mathe.teoria;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.alex.helyer.mathe.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Algebra01Fragment extends Fragment {

    WebView web; //index.html


    public Algebra01Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_algebra01, container, false);

        web = (WebView) rootView.findViewById(R.id.mywebsite);

        WebSettings webSettings = web.getSettings();
        webSettings.setJavaScriptEnabled(true);

        web.loadUrl("file:///android_asset/tema03.html");

        return rootView;
    }

}
