package com.alex.helyer.mathe;


import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.github.lzyzsd.circleprogress.DonutProgress;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class EstadisticasFragment extends Fragment {

    LineChart chart;
    PieChart pieChart;
    float[] yData = { 5, 10, 15, 30, 40 };
    String[] xData = { "Sony", "Huawei", "LG", "Apple", "SAMSUNG" };


    TextView Nivel ;
    TextView Datos;

    DonutProgress Promedio;


    public EstadisticasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_estadisticas, container, false);

        Nivel = (TextView) rootView.findViewById(R.id.txtNivel);
        Datos = (TextView) rootView.findViewById(R.id.txtDatos);
        Promedio = (DonutProgress) rootView.findViewById(R.id.promedio_progress);

        int nivel = getActivity().getSharedPreferences("ALGORITMO", Context.MODE_PRIVATE).getInt("nivel",-1);
        String datos = getActivity().getSharedPreferences("ALGORITMO", Context.MODE_PRIVATE).getString("datos","07-08-07-08-07");
        String txtPromedio = getActivity().getSharedPreferences("ALGORITMO", Context.MODE_PRIVATE).getString("promedio", "0");
        double promporcent = Double.parseDouble(txtPromedio)*10;


        int procent = (int) promporcent;


        Nivel.setText("Nivel: "+nivel);
        Datos.setText(datos);
        Promedio.setDonut_progress(Integer.toString(procent));
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        //LINE CHART
        chart = getView().findViewById(R.id.chart);
        Description description = new Description();
        description.setTextColor(Color.BLUE);
        description.setText("Chart Data");
        chart.setDescription(description);

        int[] numArr = {1,2,3,4,5,6};

        final HashMap<Integer, String> numMap = new HashMap<>();
        numMap.put(1, "enero");
        numMap.put(2, "febrero");
        numMap.put(3, "marzo");
        numMap.put(4, "abril");
        numMap.put(5, "mayo");
        numMap.put(6, "junio");

        List<Entry> entries1 = new ArrayList<>();

        for(int num : numArr){
            entries1.add(new Entry(num, num));
        }

        LineDataSet dataSet = new LineDataSet(entries1, "Desempeño");
        dataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        dataSet.setCircleColor(Color.BLACK);

        LineData data = new LineData(dataSet);

        XAxis xAxis = chart.getXAxis();
        xAxis.setValueFormatter(new IAxisValueFormatter() {

            @Override
            public String getFormattedValue(float value, AxisBase axis) {

                return numMap.get((int)value);
            }


            public int getDecimalDigits() {
                return 0;
            }
        });
        chart.setData(data);
        chart.invalidate();


        //PIE CHART

        pieChart = getView().findViewById(R.id.pieChart);
        pieChart.setUsePercentValues(true);
        Description description2 = new Description();
        description2.setTextColor(Color.BLUE);
        description2.setText("Efectividad");
        pieChart.setDescription(description2);
        pieChart.setDrawHoleEnabled(true);
        pieChart.setHoleColor(ColorTemplate.COLOR_SKIP);
        pieChart.setHoleRadius(7);
        pieChart.setTransparentCircleRadius(10);
        pieChart.setRotationAngle(0);
        pieChart.setRotationEnabled(true);
        pieChart.animateXY(3000, 3000);
        addData();


        // customize legends
        Legend l = pieChart.getLegend();
        l.setPosition(Legend.LegendPosition.RIGHT_OF_CHART);
        l.setXEntrySpace(7);
        l.setYEntrySpace(5);


        pieChart.setOnChartValueSelectedListener(new OnChartValueSelectedListener() {

            @Override
            public void onValueSelected(Entry e, Highlight h) {
                Toast.makeText(getActivity(), xData[(Integer) e.getData()]+" : " + yData[(Integer) e.getData()], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected() {

            }
        });


    }


    private void addData() {
        ArrayList<PieEntry> yVals1 = new ArrayList<>();

        for (int i = 0; i < yData.length; i++)
            yVals1.add(new PieEntry(yData[i], i));

        ArrayList<String> xVals = new ArrayList<String>();

        for (int i = 0; i < xData.length; i++)
            xVals.add(xData[i]);

        // create pie data set
        PieDataSet dataSet = new PieDataSet(yVals1, "Market Share");
        dataSet.setSliceSpace(3);
        dataSet.setSelectionShift(5);

        // add many colors
        ArrayList<Integer> colors = new ArrayList<>();

        for (int c : ColorTemplate.VORDIPLOM_COLORS)
            colors.add(c);

        for (int c : ColorTemplate.JOYFUL_COLORS)
            colors.add(c);

        for (int c : ColorTemplate.COLORFUL_COLORS)
            colors.add(c);

        for (int c : ColorTemplate.LIBERTY_COLORS)
            colors.add(c);

        for (int c : ColorTemplate.PASTEL_COLORS)
            colors.add(c);

        colors.add(ColorTemplate.getHoloBlue());
        dataSet.setColors(colors);

        // instantiate pie data object now
        PieData data = new PieData(dataSet);
        data.setValueFormatter(new PercentFormatter());
        data.setValueTextSize(13f);
        data.setValueTextColor(Color.BLACK);

        pieChart.setData(data);
        pieChart.highlightValues(null);

        // update pie chart
        pieChart.invalidate();
    }

}
