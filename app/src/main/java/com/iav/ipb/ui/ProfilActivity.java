package com.iav.ipb.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.iav.ipb.R;

public class ProfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finishAffinity();
        startActivity(new Intent(getApplicationContext(), MenuActivity.class));
    }
}
