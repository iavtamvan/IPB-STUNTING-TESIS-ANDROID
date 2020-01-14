package com.iav.ipb.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.card.MaterialCardView;
import com.iav.ipb.R;
import com.iav.ipb.ui.intro.IntroActivity;
import com.iav.ipb.ui.kuis.KuisActivity;

public class MenuActivity extends AppCompatActivity {

    private ImageView ivMenuMateri;
    private ImageView ivMenuSoal;
    private ImageView ivMenuProfil;
    private MaterialCardView cvPengetahuan;
    private MaterialCardView cvSkrining;
    private MaterialCardView cvProfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        cvPengetahuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), PengetahuanActivity.class));
            }
        });

        cvSkrining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), TinggiBadanActivity.class));
            }
        });

        cvProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ProfilActivity.class));
            }
        });
    }


    private void initView() {
        cvPengetahuan = (MaterialCardView) findViewById(R.id.cv_pengetahuan);
        cvSkrining = (MaterialCardView) findViewById(R.id.cv_skrining);
        cvProfil = (MaterialCardView) findViewById(R.id.cv_profil);
    }
}
