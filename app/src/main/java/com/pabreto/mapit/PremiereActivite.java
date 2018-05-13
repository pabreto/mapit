package com.pabreto.mapit;

import android.app.Activity;
import android.os.Bundle;


public class PremiereActivite extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView text = new TextView(this);
        text.setText("Bonjour, vous me devez 1 000 000€.");
        setContentView(text);
    }
}