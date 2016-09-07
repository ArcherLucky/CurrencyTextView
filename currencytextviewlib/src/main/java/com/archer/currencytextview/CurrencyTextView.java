package com.archer.currencytextview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.v7.widget.AppCompatTextView;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.util.TypedValue;

import com.archer.currencytextviewlib.R;

/**
 * 货币TextView，可以选择货币类型，金额前自动填充货币符号
 * 可以自定义货币符号的颜色，大小
 * 可以自定义金额的颜色，大小
 * Created by LiuZhe on 2016/9/7.
 */
public class CurrencyTextView extends AppCompatTextView {

    /**
     * 货币符号的String
     */
    private String currencyStr;
    /**
     * 货币符号的Color
     */
    private int currencyColor;
    /**
     * 货币符号的大小
     */
    private int currencySize;
    /**
     * 金额的String
     */
    private String amountStr;
    /**
     * 金额的颜色
     */
    private int amountColor;
    /**
     * 金额的大小
     */
    private int amountSize;
    /**
     * 金额前是否用空格
     */
    private boolean hasSpace;

    public CurrencyTextView(Context context) {
        super(context, null);
    }

    public CurrencyTextView(Context context, AttributeSet attrs) {
        super(context, attrs, 0);
        setup(context, attrs, 0);
    }

    public CurrencyTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setup(context, attrs, defStyleAttr);
    }

    private void setup(Context context, AttributeSet attrs, int defStyleAttr) {
        /**
         * 获得我们所定义的自定义样式属性
         */
        TypedArray a = context.getTheme().obtainStyledAttributes(attrs, R.styleable.currencyTextView, defStyleAttr, 0);
        currencyStr = a.getString(R.styleable.currencyTextView_currency_type);
        currencyColor = a.getColor(R.styleable.currencyTextView_currency_color, Color.BLACK);
        currencySize = a.getDimensionPixelSize(R.styleable.currencyTextView_currency_size, (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_SP, 18, getResources().getDisplayMetrics()));
        amountStr = a.getString(R.styleable.currencyTextView_amount_str);
        amountColor = a.getColor(R.styleable.currencyTextView_amount_color, Color.BLACK);
        amountSize = a.getDimensionPixelSize(R.styleable.currencyTextView_amount_size, (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_SP, 14, getResources().getDisplayMetrics()));
        hasSpace = a.getBoolean(R.styleable.currencyTextView_has_space, true);
        a.recycle();
    }

    public String getCurrencyStr() {
        return currencyStr;
    }

    public void setCurrencyStr(String currencyStr) {
        this.currencyStr = currencyStr;
    }

    public int getCurrencyColor() {
        return currencyColor;
    }

    public void setCurrencyColor(int currencyColor) {
        this.currencyColor = currencyColor;
    }

    public int getCurrencySize() {
        return currencySize;
    }

    public void setCurrencySize(int currencySize) {
        this.currencySize = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_SP, currencySize, getResources().getDisplayMetrics());
    }

    public String getAmountStr() {
        return amountStr;
    }

    public void setAmountStr(String amountStr) {
        this.amountStr = hasSpace ? " " + amountStr : amountStr;
    }

    public int getAmountColor() {
        return amountColor;
    }

    public void setAmountColor(int amountColor) {
        this.amountColor = amountColor;
    }

    public int getAmountSize() {
        return amountSize;
    }

    public void setAmountSize(int amountSize) {
        this.amountSize = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_SP, amountSize, getResources().getDisplayMetrics());
    }

    public void apply() {

        String text = currencyStr + amountStr;
        Spannable s = new SpannableString(text);
        if (!TextUtils.isEmpty(currencyStr)) s.setSpan(new ForegroundColorSpan(currencyColor),
                text.indexOf(currencyStr), text.indexOf(currencyStr) + currencyStr.length(),
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        if (!TextUtils.isEmpty(amountStr)) s.setSpan(new ForegroundColorSpan(amountColor),
                text.indexOf(amountStr), text.indexOf(amountStr) + amountStr.length(),
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        if (!TextUtils.isEmpty(currencyStr)) s.setSpan(new AbsoluteSizeSpan(currencySize),
                text.indexOf(currencyStr), text.indexOf(currencyStr) + currencyStr.length(),
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        if (!TextUtils.isEmpty(amountStr)) s.setSpan(new AbsoluteSizeSpan(amountSize),
                text.indexOf(amountStr), text.indexOf(amountStr) + amountStr.length(),
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        setText(s, BufferType.SPANNABLE);
    }

}
