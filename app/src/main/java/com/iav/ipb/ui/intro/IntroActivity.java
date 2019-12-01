package com.iav.ipb.ui.intro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.iav.ipb.ui.MenuActivity;
import com.iav.ipb.R;

public class IntroActivity extends AppCompatActivity {

    private Button btnMulaiIntro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        initView();


        btnMulaiIntro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
                startActivity(new Intent(getApplicationContext(), MenuActivity.class));
            }
        });

    }

    private void initView() {
        btnMulaiIntro = findViewById(R.id.btn_mulai_intro);
    }
}
