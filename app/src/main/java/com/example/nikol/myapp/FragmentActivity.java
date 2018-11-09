package com.example.nikol.myapp;

import android.os.Bundle;
import android.support.annotation.Nullable;

public class FragmentActivity extends android.support.v4.app.FragmentActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_with_fragment);

    }
}
