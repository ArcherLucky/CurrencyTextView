CurrencyTextView
======================

easy to display a currency text.

# Features

* API > 14 
* Support currency color, type, size
* Support amount color, type, size
 
![Art](https://github.com/ArcherLucky/CurrencyTextView/blob/master/art/art.png)

  
# Samples

You can [download a sample APK](https://github.com/ArcherLucky/CurrencyTextView/blob/master/apk/simple.apk) 

 
# Gradle Dependency

```xml
dependencies { 
   compile 'com.archer.currencytextview:currencytextviewlib:1.0.0'
}
```


# Sample Usage
 
```xml
    <LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:currency="http://schemas.android.com/apk/res-auto"
    android:orientation="vertical"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:paddingBottom="@dimen/activity_vertical_margin"
    android:paddingLeft="@dimen/activity_horizontal_margin"
    android:paddingRight="@dimen/activity_horizontal_margin"
    android:paddingTop="@dimen/activity_vertical_margin"
    tools:context="com.archer.simple.MainActivity">

    <com.archer.currencytextview.CurrencyTextView
        android:id="@+id/tv"
        android:gravity="center"
        android:layout_marginBottom="20dp"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"/>
</LinearLayout>
```
 
```java
    // please see the demo
    currencyTextView = (CurrencyTextView) findViewById(R.id.tv);
    currencyTextView.setCurrencyStr(getString(R.string.rmb));
	currencyTextView.setCurrencyColor(Color.BLACK);
	currencyTextView.setCurrencySize(28);
	currencyTextView.setAmountStr("100");
	currencyTextView.setAmountColor(Color.RED);
	currencyTextView.setAmountSize(22);
	currencyTextView.apply();

```
 
 
# Contact & Help

Please fell free to contact me if there is any problem when using the library.

* email: liuzhe.android@gmail.com 

 

