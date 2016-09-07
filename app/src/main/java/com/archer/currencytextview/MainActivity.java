package com.archer.currencytextview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.archer.currencytextviewlib.CurrencyTextView;

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
