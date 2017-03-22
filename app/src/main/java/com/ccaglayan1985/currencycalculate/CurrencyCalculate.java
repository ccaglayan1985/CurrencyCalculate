package com.ccaglayan1985.currencycalculate;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Spinner;

import static com.ccaglayan1985.currencycalculate.R.array.islem_tipi;


public class CurrencyCalculate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_calculate);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        final String islemtipi[] = getResources().getStringArray(islem_tipi);


    }


    public void doviztipidegistir(View view) {
        Intent intent = new Intent(CurrencyCalculate.this, CurrencySelection.class);
        startActivity(intent);
    }
}


