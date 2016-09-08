package com.archer.simple;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.archer.currencytextview.CurrencyTextView;
import com.archer.currencytextview.R;

public class MainActivity extends AppCompatActivity {

    CurrencyTextView currencyTextView;
    CurrencyTextView currencyTextView1;
    CurrencyTextView currencyTextView2;
    CurrencyTextView currencyTextView3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        currencyTextView = (CurrencyTextView) findViewById(R.id.tv);
        currencyTextView.setCurrencyStr(getString(R.string.rmb));
        currencyTextView.setCurrencyColor(Color.BLACK);
        currencyTextView.setCurrencySize(28);
        currencyTextView.setAmountStr("100");
        currencyTextView.setAmountColor(Color.RED);
        currencyTextView.setAmountSize(22);
        currencyTextView.apply();


        currencyTextView1 = (CurrencyTextView) findViewById(R.id.tv1);
        currencyTextView1.setCurrencyStr(getString(R.string.dollar));
        currencyTextView1.setCurrencyColor(Color.BLUE);
        currencyTextView1.setCurrencySize(22);
        currencyTextView1.setAmountStr("500");
        currencyTextView1.setAmountColor(Color.BLACK);
        currencyTextView1.setAmountSize(16);
        currencyTextView1.apply();

        currencyTextView2 = (CurrencyTextView) findViewById(R.id.tv2);
        currencyTextView2.setCurrencyStr(getString(R.string.rmb));
        currencyTextView2.setCurrencyColor(Color.BLACK);
        currencyTextView2.setCurrencySize(38);
        currencyTextView2.setAmountStr("100");
        currencyTextView2.setAmountColor(Color.RED);
        currencyTextView2.setAmountSize(32);
        currencyTextView2.apply();

        currencyTextView3 = (CurrencyTextView) findViewById(R.id.tv3);
        currencyTextView3.setCurrencyStr(getString(R.string.dollar));
        currencyTextView3.setCurrencyColor(Color.RED);
        currencyTextView3.setCurrencySize(58);
        currencyTextView3.setAmountStr("100");
        currencyTextView3.setAmountColor(Color.GRAY);
        currencyTextView3.setAmountSize(34);
        currencyTextView3.apply();

    }
}
