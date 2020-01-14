package com.iav.ipb.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.card.MaterialCardView;
import com.iav.ipb.R;
import com.iav.ipb.ui.intro.IntroANCActivity;
import com.iav.ipb.ui.intro.IntroAnemiaActivity;
import com.iav.ipb.ui.intro.IntroDiabetesMelitusActivity;
import com.iav.ipb.ui.intro.IntroHipertensiActivity;
import com.iav.ipb.ui.intro.IntroKEKActivity;
import com.iav.ipb.ui.intro.IntroPreeklamsiaActivity;
import com.iav.ipb.ui.intro.IntroSanitasiActivity;

public class PengetahuanActivity extends AppCompatActivity {

    private MaterialCardView cvklikAnemia;
    private MaterialCardView cvklikKek;
    private MaterialCardView cvklikPreeklamsia;
    private MaterialCardView tvklikDiabetesMelitus;
    private MaterialCardView cvklikHipertensi;
    private MaterialCardView cvklikANC;
    private MaterialCardView cvklikSanitasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengetahuan);
        initView();


        cvklikAnemia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), IntroAnemiaActivity.class));
            }
        });
        cvklikANC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), IntroANCActivity.class));
            }
        });

        tvklikDiabetesMelitus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), IntroDiabetesMelitusActivity.class));
            }
        });

        cvklikHipertensi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), IntroHipertensiActivity.class));
            }
        });

        cvklikKek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), IntroKEKActivity.class));
            }
        });

        cvklikPreeklamsia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), IntroPreeklamsiaActivity.class));
            }
        });

        cvklikSanitasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), IntroSanitasiActivity.class));
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finishAffinity();
        startActivity(new Intent(getApplicationContext(), MenuActivity.class));
    }

    private void initView() {
        cvklikAnemia = findViewById(R.id.cvklikAnemia);
        cvklikKek = findViewById(R.id.cvklikKek);
        cvklikPreeklamsia = findViewById(R.id.cvklikPreeklamsia);
        tvklikDiabetesMelitus = findViewById(R.id.tvklikDiabetesMelitus);
        cvklikHipertensi = findViewById(R.id.cvklikHipertensi);
        cvklikANC = findViewById(R.id.cvklikANC);
        cvklikSanitasi = findViewById(R.id.cvklikSanitasi);
    }
}
