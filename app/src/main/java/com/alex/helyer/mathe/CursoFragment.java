package com.alex.helyer.mathe;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class CursoFragment extends Fragment {

    private TabLayout tabLayout;
    private ViewPager mViewPager;

    public CursoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View cursoFragment = inflater.inflate(R.layout.fragment_curso, container, false);

        mViewPager = (ViewPager) cursoFragment.findViewById(R.id.mViewPager);

        tabLayout = (TabLayout) cursoFragment.findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

        setupViewPager(mViewPager);

        return cursoFragment;
    }

    public void setupViewPager (ViewPager viewPager) {
        TabViewPagerAdapter adapter = new TabViewPagerAdapter(getChildFragmentManager());
        adapter.addFragment(new CursopracticaFragment(), "Practica");
        adapter.addFragment(new CursoteoriaFragment(), "Teoria");

        viewPager.setAdapter(adapter);
    }

    @Override
    public void onResume() {
        super.onResume();
        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
    }
}
