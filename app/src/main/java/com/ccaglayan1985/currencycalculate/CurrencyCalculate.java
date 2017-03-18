package com.ccaglayan1985.currencycalculate;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import static com.ccaglayan1985.currencycalculate.R.array.islem_tipi;


public class CurrencyCalculate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_calculate);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        final String islemtipi[] = getResources().getStringArray(islem_tipi);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.activity_list_item, islemtipi);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "seçilen işlem tipi" + islemtipi[position], Toast.LENGTH_SHORT).show();

                switch (position) {


                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}


