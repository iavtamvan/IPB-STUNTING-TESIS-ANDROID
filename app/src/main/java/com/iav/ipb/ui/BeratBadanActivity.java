package com.iav.ipb.ui;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.iav.ipb.R;

public class BeratBadanActivity extends AppCompatActivity {

    private EditText edtTinggiBadan;
    private EditText edtBeratBadanSebelumHamil;
    private EditText edtBeratBadanSesudahHamil;
    private Button btnHitung;

    private double tinggiBadanMeter;
    private int bmi;
    private int beratBadanSaatHamil;
    private String status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berat_badan);
        initView();


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


        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO Fixed Rumus
//                tinggiBadanMeter = Double.valueOf(edtTinggiBadan.getText().toString())/100;
//                bmi = (int) (Integer.parseInt(edtBeratBadanSebelumHamil.getText().toString())/(tinggiBadanMeter*tinggiBadanMeter));
//                Toast.makeText(BeratBadanActivity.this, "" + bmi, Toast.LENGTH_SHORT).show();
//                if (bmi < 18.5){
//                    status = "Kekurangan berat badan";
//                    Toast.makeText(BeratBadanActivity.this, "" + status, Toast.LENGTH_SHORT).show();
//                } else if (bmi < 18.6 || bmi <= 22.9){
//                    status = "Berat badan normal";
//                    Toast.makeText(BeratBadanActivity.this, "" + status, Toast.LENGTH_SHORT).show();
//                } else if (bmi <= 23 || bmi <=24.9){
//                    status = "Kelebihan berat badan";
//                    Toast.makeText(BeratBadanActivity.this, "" + status, Toast.LENGTH_SHORT).show();
//                } else {
//                    status = "Obesitas";
//                    Toast.makeText(BeratBadanActivity.this, "" + status, Toast.LENGTH_SHORT).show();
//                }

                beratBadanSaatHamil = Integer.parseInt(edtBeratBadanSebelumHamil.getText().toString()) - Integer.parseInt(edtBeratBadanSesudahHamil.getText().toString());
                Toast.makeText(BeratBadanActivity.this, "" + beratBadanSaatHamil, Toast.LENGTH_SHORT).show();

                if (beratBadanSaatHamil < 18){
                    status = "Kekurangan berat badan";
                    Toast.makeText(BeratBadanActivity.this, "Harus menaikan berat badan hingga 12.5 - 18Kg Selama masa kehamilan", Toast.LENGTH_SHORT).show();
                } else if (beratBadanSaatHamil < 11.5 || beratBadanSaatHamil <= 16){
                    status = "Berat badan normal";
                    Toast.makeText(BeratBadanActivity.this, "Harus menaikan berat badan hingga 11.5 - 16 Kg Selama masa kehamilan", Toast.LENGTH_SHORT).show();
                } else if (beratBadanSaatHamil < 7 || beratBadanSaatHamil <=11.5){
                    status = "Kelebihan berat badan";
                    Toast.makeText(BeratBadanActivity.this, "Harus menaikan berat badan hingga 7 - 11.5 Kg Selama masa kehamilan", Toast.LENGTH_SHORT).show();
                } else {
                    status = "Obesitas";
                    Toast.makeText(BeratBadanActivity.this, "Harus menaikan berat badan hingga 5 - 7 Kg Selama masa kehamilan", Toast.LENGTH_SHORT).show();
                }




            }
        });
    }

    private void initView() {
        edtTinggiBadan = findViewById(R.id.edtTinggiBadan);
        edtBeratBadanSebelumHamil = findViewById(R.id.edtBeratBadanSebelumHamil);
        edtBeratBadanSesudahHamil = findViewById(R.id.edtBeratBadanSesudahHamil);
        btnHitung = findViewById(R.id.btnHitung);
    }
}
