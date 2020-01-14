package com.iav.ipb.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.iav.ipb.R;
import com.iav.ipb.ui.kuis.KuisActivity;

public class UsiaKehamilanActivity extends AppCompatActivity {

    private TextView tvStatus;
    private EditText edtUsiaHamil;
    private Button btnLanjut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usia_kehamilan);
        initView();
        tvStatus.setText("Status");

        edtUsiaHamil.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.toString().isEmpty()){
                    edtUsiaHamil.setError("Isi dahulu");
                    tvStatus.setText("Status");
                }
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.toString().isEmpty()){
                    edtUsiaHamil.setError("Isi dahulu");
                    tvStatus.setText("Status");
                } else {
                    tvStatus.setText(edtUsiaHamil.getText().toString().trim() + " Minggu");
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        btnLanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
                startActivity(new Intent(getApplicationContext(), KuisActivity.class));
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(getApplicationContext(), BeratBadanActivity.class));
    }

    private void initView() {
        tvStatus = findViewById(R.id.tv_status);
        edtUsiaHamil = findViewById(R.id.edt_usia_hamil);
        btnLanjut = findViewById(R.id.btn_lanjut);
    }
}
