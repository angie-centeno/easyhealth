package com.julio.holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import  android.webkit.WebView;
import android.app.Activity;

public class Mapa extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);
        WebView mywebview=(WebView)this.findViewById(R.id.webView);
        mywebview.loadUrl("https://www.google.com/maps/d/viewer?mid=1fmrjvSzXUBU7EkPNv7XEHHFJtRQ");
    }
}
