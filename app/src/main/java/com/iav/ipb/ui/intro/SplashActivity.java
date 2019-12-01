package com.iav.ipb.ui.intro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.iav.ipb.R;

public class SplashActivity extends AppCompatActivity {

    private Button btnMulai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        initView();
        btnMulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
                startActivity(new Intent(getApplicationContext(), IntroActivity.class));
            }
        });

    }

    private void initView() {
        btnMulai = findViewById(R.id.btn_mulai);
    }
}
