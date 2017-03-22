package com.ccaglayan1985.currencycalculate;


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

        String islem_tipi[] = getResources().getStringArray(R.array.islemtipi);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, islem_tipi);
        spinner.setAdapter(adapter);

    }


    public void doviztipidegistir(View view) {
        /**Intent intent = new Intent(CurrencyCalculate.this, CurrencySelection.class);
        startActivity(intent);
         }*/
}
}


