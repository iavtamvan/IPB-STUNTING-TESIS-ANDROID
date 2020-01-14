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
import com.iav.ipb.ui.kuis.KuisActivity;

public class BeratBadanActivity extends AppCompatActivity {

    private String bbSebelumHamil;
    private double tinggiBadanMeter;
    private int bmi;
    private int beratBadanSaatHamil;
    private String status;
    private TextView tvStatus;
    private EditText edtBeratBadanSaatini;
    private Button btnLanjut;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berat_badan);
        initView();
        bbSebelumHamil = getIntent().getStringExtra("BERAT_BADAN");
        tvStatus.setText("Status");

//        edtTinggiBadan.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//                if (edtTinggiBadan.getText().toString().isEmpty()) {
//                    edtTinggiBadan.setError("Harus Di isi");
//                }
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
////                if (edtTinggiBadan.getText().toString().isEmpty()){
////                    edtTinggiBadan.setError("Harus Di isi");
////                } else {
//                tinggiBadanMeter = Integer.parseInt(charSequence.toString()) / 100;
//
//                Toast.makeText(BeratBadanActivity.this, "tinggi badan > " + tinggiBadanMeter, Toast.LENGTH_SHORT).show();
//                Toast.makeText(BeratBadanActivity.this, "tinggi badan > " + tinggiBadanMeter, Toast.LENGTH_SHORT).show();
//                Toast.makeText(BeratBadanActivity.this, "tinggi badan > " + tinggiBadanMeter, Toast.LENGTH_SHORT).show();
//                Toast.makeText(BeratBadanActivity.this, "tinggi badan > " + tinggiBadanMeter, Toast.LENGTH_SHORT).show();
//                Toast.makeText(BeratBadanActivity.this, "tinggi badan > " + tinggiBadanMeter, Toast.LENGTH_SHORT).show();
////                }
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//            }
//        });
//
//        edtBeratBadanSebelumHamil.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//                if (edtBeratBadanSebelumHamil.getText().toString().isEmpty()) {
//                    edtBeratBadanSebelumHamil.setError("Harus Di Isi");
//                } else {
//                    bmi = Integer.parseInt(charSequence.toString()) / (tinggiBadanMeter * tinggiBadanMeter);
//
//                }
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//                Toast.makeText(BeratBadanActivity.this, "" + bmi, Toast.LENGTH_SHORT).show();
//                Toast.makeText(BeratBadanActivity.this, "" + bmi, Toast.LENGTH_SHORT).show();
//                Toast.makeText(BeratBadanActivity.this, "" + bmi, Toast.LENGTH_SHORT).show();
//                Toast.makeText(BeratBadanActivity.this, "" + bmi, Toast.LENGTH_SHORT).show();
//            }
//        });

        edtBeratBadanSaatini.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.toString().isEmpty()){
                    edtBeratBadanSaatini.setError("Isi dahulu");
                    tvStatus.setText("Status");
                }
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.toString().isEmpty()){
                    edtBeratBadanSaatini.setError("Isi dahulu");
                    tvStatus.setText("Status");
                } else {
                    beratBadanSaatHamil = Integer.parseInt(String.valueOf(bbSebelumHamil)) - Integer.parseInt(edtBeratBadanSaatini.getText().toString());
                    Toast.makeText(BeratBadanActivity.this, "" + beratBadanSaatHamil, Toast.LENGTH_SHORT).show();

                    if (beratBadanSaatHamil < 18.5) {
                        status = "Kekurangan berat badan";
                        tvStatus.setText("Harus menaikan berat badan hingga 12.5 - 18Kg Selama masa kehamilan");
                    } else if (beratBadanSaatHamil >= 18.5 && beratBadanSaatHamil <= 22.9) {
                        status = "Berat badan normal";
                        tvStatus.setText("Harus menaikan berat badan hingga 11.5 - 16 Kg Selama masa kehamilan");
                    } else if (beratBadanSaatHamil >= 23 && beratBadanSaatHamil <= 24.9) {
                        status = "Kelebihan berat badan";
                        tvStatus.setText("Harus menaikan berat badan hingga 7 - 11.5 Kg Selama masa kehamilan");
                    } else {
                        status = "Obesitas";
                        tvStatus.setText("Harus menaikan berat badan hingga 5 - 7 Kg Selama masa kehamilan");
                    }

                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        
        btnLanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), UsiaKehamilanActivity.class));
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(getApplicationContext(), TinggiBadanActivity.class));
    }

    private void initView() {
        tvStatus = findViewById(R.id.tv_status);
        btnLanjut = findViewById(R.id.btn_lanjut_tinggi_badan);
        tvStatus = findViewById(R.id.tv_status);
        edtBeratBadanSaatini = findViewById(R.id.edt_berat_badan_saatini);
    }
}
