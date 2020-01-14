package com.iav.ipb.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.iav.ipb.R;

public class TinggiBadanActivity extends AppCompatActivity {

    private TextView tvStatus;
    private EditText edtTinggiBadan;
    private Button btnLanjutTinggiBadan;
    private double tinggiBadanMeter;
    private int bmi;
    private String status;
    private EditText edtBeratBadan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tinggi_badan);
        initView();

        tvStatus.setText("Status");

        edtTinggiBadan.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.toString().isEmpty()) {
                    edtTinggiBadan.setError("Isi dahulu");
                    tvStatus.setText("Status");
                }
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.toString().isEmpty()) {
                    edtTinggiBadan.setError("Isi dahulu");
                    tvStatus.setText("Status");
                } else {
                    tinggiBadanMeter = Double.valueOf(edtTinggiBadan.getText().toString()) / 100;
                    bmi = (int) (Integer.parseInt(edtBeratBadan.getText().toString()) / (tinggiBadanMeter * tinggiBadanMeter));
                    Toast.makeText(TinggiBadanActivity.this, "" + bmi, Toast.LENGTH_SHORT).show();
                    if (bmi < 18.5) {
                        status = "Kekurangan berat badan";
                        tvStatus.setText(status);
                    } else if (bmi >= 18.6 && bmi <= 22.9) {
                        status = "Berat badan normal";
                        tvStatus.setText(status);
                    } else if (bmi >= 23 && bmi <= 24.9) {
                        status = "Kelebihan berat badan";
                    } else {
                        status = "Obesitas";
                        tvStatus.setText(status);
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        btnLanjutTinggiBadan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BeratBadanActivity.class);
                intent.putExtra("BERAT_BADAN",  edtBeratBadan.getText().toString().trim());
                startActivity(intent);

            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(getApplicationContext(), MenuActivity.class));
    }

    private void initView() {
        tvStatus = findViewById(R.id.tv_status);
        edtTinggiBadan = findViewById(R.id.edt_tinggi_badan);
        btnLanjutTinggiBadan = findViewById(R.id.btn_lanjut_tinggi_badan);
        edtBeratBadan = findViewById(R.id.edt_berat_badan);
    }
}
