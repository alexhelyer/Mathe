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
    float[] yData = { 0, 0, 0 };
    String[] xData = { "Reactivos Multiples", "Reactivos Abiertos", "Reactivos Verdadero-Falso"};





    //TextView Nivel ;
    //TextView Datos;

    //DonutProgress Promedio;
    DonutProgress PromedioGenerales;

    TextView PromedioGeneral;

    public EstadisticasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_estadisticas, container, false);

        //Nivel = (TextView) rootView.findViewById(R.id.txtNivel);
        //Datos = (TextView) rootView.findViewById(R.id.txtDatos);
        //Promedio = (DonutProgress) rootView.findViewById(R.id.promedio_progress);
        PromedioGenerales = (DonutProgress) rootView.findViewById(R.id.promedio_general);
        PromedioGeneral = (TextView) rootView.findViewById(R.id.txtPromedioGeneral);

        int nivel = getActivity().getSharedPreferences("ALGORITMO", Context.MODE_PRIVATE).getInt("nivel",-1);
        String datos = getActivity().getSharedPreferences("ALGORITMO", Context.MODE_PRIVATE).getString("datos","08-08-08-08-08");
        String txtPromedio = getActivity().getSharedPreferences("ALGORITMO", Context.MODE_PRIVATE).getString("promedio", "0");
        double promporcent = Double.parseDouble(txtPromedio)*10;

        String txtPromedioGeneral = getActivity().getSharedPreferences("ESTADISTICAS", Context.MODE_PRIVATE).getString("promedio_general", "0-0");


        int procent = (int) promporcent;


        //Nivel.setText("Nivel: "+nivel);
        //Datos.setText(datos);

        //PromedioGeneral.setText(""+getPromedioGeneral(txtPromedioGeneral));
        //PromedioGeneral.setText(txtPromedioGeneral);

        //Promedio.setDonut_progress(Integer.toString(procent));
        if ( txtPromedioGeneral.contentEquals("0-0") )
            PromedioGenerales.setDonut_progress("0");
        else
            PromedioGenerales.setDonut_progress( Integer.toString((int)(getPromedioGeneral(txtPromedioGeneral)*10)) );



        //LineChart
        LineChart chart = (LineChart) rootView.findViewById(R.id.chart);

        Description description = new Description();
        description.setTextColor(Color.BLUE);
        description.setText("");
        chart.setDescription(description);

        int[] numArr = getdesempenio();

        List<Entry> entries1 = new ArrayList<>();

        int x = 0;
        for(int num : numArr){
            x++;
            entries1.add(new Entry(x, num));
        }

        LineDataSet dataSet = new LineDataSet(entries1, "Desempeño");
        dataSet.setColors(Color.parseColor("#3498DB"));
        dataSet.setCircleColor(Color.parseColor("#3498DB"));
        dataSet.setDrawCircles(true);


        LineData data = new LineData(dataSet);
        chart.setData(data);
        chart.invalidate();

        XAxis xAxis = chart.getXAxis();
        xAxis.setValueFormatter(new IAxisValueFormatter() {
            @Override
            public String getFormattedValue(float value, AxisBase axis) {
                return "";
            }
        });

        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        //LINE CHART
        /*
        chart = getView().findViewById(R.id.chart);
        Description description = new Description();
        description.setTextColor(Color.BLUE);
        description.setText("Chart Data");
        chart.setDescription(description);

        int[] numArr = {1,2,3,4,5,6};

        final HashMap<Integer, String> numMap = new HashMap<>();
        numMap.put(1, "");
        numMap.put(2, "");
        numMap.put(3, "");
        numMap.put(4, "");
        numMap.put(5, "");
        numMap.put(5, "");

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
*/

        //PIE CHART

        pieChart = getView().findViewById(R.id.pieChart);
        pieChart.setUsePercentValues(true);
        Description description2 = new Description();
        description2.setTextColor(Color.BLUE);
        description2.setText("");
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
                //Toast.makeText(getActivity(), xData[(Integer) e.getData()]+" : " + yData[(Integer) e.getData()], Toast.LENGTH_SHORT).show();
                String mi_efectividad = getActivity().getSharedPreferences("ESTADISTICAS", Context.MODE_PRIVATE).getString("efectividad", "0-0-0");
                String[] midatos = mi_efectividad.split("-");
                Toast.makeText(getActivity(), xData[(Integer) e.getData()]+" : " + midatos[(Integer) e.getData()], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected() {

            }
        });


    }


    private void addData() {
        ArrayList<PieEntry> yVals1 = new ArrayList<>();

        String mi_efectividad = getActivity().getSharedPreferences("ESTADISTICAS", Context.MODE_PRIVATE).getString("efectividad", "0-0-0");
        String[] midatos = mi_efectividad.split("-");
        for (int i = 0; i < midatos.length; i++)
            yVals1.add(new PieEntry(Integer.parseInt(midatos[i]), i));

        ArrayList<String> xVals = new ArrayList<String>();

        for (int i = 0; i < xData.length; i++)
            xVals.add(xData[i]);

        // create pie data set
        PieDataSet dataSet = new PieDataSet(yVals1, "Reactivos");
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

    public double getPromedioGeneral(String datos) {
        String[] midatos = datos.split("-");

        double promedio = 0;

        if ( Double.parseDouble(midatos[1]) == 0 )
            promedio =  -1;
        else
            promedio =  Double.parseDouble(midatos[0]) / Double.parseDouble(midatos[1]);

        return promedio;
    }

    public int[] getdesempenio() {

        String datos = getActivity().getSharedPreferences("ALGORITMO", Context.MODE_PRIVATE).getString("desempenio","00-00-00-00-00");
        String[] midatos = datos.split("-");

        int[] respuesta = new int[5];

        for (int i=0; i<midatos.length; i++) {
            respuesta[i] = Integer.parseInt(midatos[i]);
        }

        return respuesta;
    }

}
