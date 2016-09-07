package com.archer.simple;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.archer.currencytextview.CurrencyTextView;
import com.archer.currencytextview.R;

public class MainActivity extends AppCompatActivity {

    CurrencyTextView currencyTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        currencyTextView = (CurrencyTextView) findViewById(R.id.tv);
        currencyTextView.setCurrencyStr(getString(R.string.rmb));
        currencyTextView.setCurrencyColor(Color.GREEN);
        currencyTextView.setAmountStr("100");
        currencyTextView.apply();

    }
}
