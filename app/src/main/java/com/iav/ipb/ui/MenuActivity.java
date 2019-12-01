package com.iav.ipb.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.iav.ipb.R;

public class MenuActivity extends AppCompatActivity {

    private ImageView ivMenuMateri;
    private ImageView ivMenuSoal;
    private ImageView ivMenuProfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        ivMenuMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuActivity.this, MateriActivity.class));
            }
        });
    }

    private void initView() {
        ivMenuMateri = findViewById(R.id.iv_menu_materi);
        ivMenuSoal = findViewById(R.id.iv_menu_soal);
        ivMenuProfil = findViewById(R.id.iv_menu_profil);
    }
}
