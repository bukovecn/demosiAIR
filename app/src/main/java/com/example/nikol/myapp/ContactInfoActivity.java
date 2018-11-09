package com.example.nikol.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ContactInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_info);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.buttonGoogleMaps)
    public void buttonGoogleMapsClicked(View view){
        Intent intent = new Intent(view.getContext(), NavigationActivity.class);
        view.getContext().startActivity(intent);
    }
}
