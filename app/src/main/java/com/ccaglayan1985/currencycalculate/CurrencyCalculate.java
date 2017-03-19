package com.ccaglayan1985.currencycalculate;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class CurrencyCalculate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_calculate);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        final String islemtipi[] = getResources().getStringArray(R.array.islem_tipi);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.activity_list_item, islemtipi);
        spinner.setAdapter(adapter);


    }


    public void doviztipi(View view) {
        if (view.getId() == R.id.button2) ;
        Intent intent = new Intent(getApplicationContext(), CurrencySelection.class);
        startActivity(intent);


    }
}


