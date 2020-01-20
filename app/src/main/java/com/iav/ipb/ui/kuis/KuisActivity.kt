package com.iav.ipb.ui.kuis

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity
import com.iav.ipb.R
import com.iav.ipb.data.KuisData
import com.iav.ipb.model.KuisModel
import kotlinx.android.synthetic.main.activity_kuis.*
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.textColor
import org.jetbrains.anko.toast

@Suppress("DEPRECATION")
class KuisActivity : AppCompatActivity(), View.OnClickListener {

    var listKuis: ArrayList<String> = ArrayList()

    var listPilihanJawaban: ArrayList<ArrayList<String>> = ArrayList()
    var listJudulDeskripsiJawaban: ArrayList<ArrayList<String>> = ArrayList()
    var listDeskripsiJawaban: ArrayList<ArrayList<ArrayList<String>>> = ArrayList()

    var listJawabanDenganDeskripsi: ArrayList<KuisModel> = ArrayList()

    var indexKuis = 0
    var skor = 0
    var listIndexSoalJawabanTidak: ArrayList<Int> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kuis)
        supportActionBar?.hide()

        listKuis = KuisData.kuisSoal
        listPilihanJawaban = KuisData.pilihanJawabanSoal
        listJudulDeskripsiJawaban = KuisData.titleDeskripsiJawabanSoal
        listDeskripsiJawaban = KuisData.deskripsiJawabanSoal
        generateKuis()

        kuis_edt.addTextChangedListener(object: TextWatcher{
            override fun afterTextChanged(p0: Editable?) {

            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (!p0.isNullOrBlank() || !p0.isNullOrEmpty()){
                    val age = p0.toString().toInt()
                    when {
                        age < 20 -> {
                            kuis_tv_status.text = "Terlalu muda untuk hamil"
                        }
                        age > 35 -> {
                            kuis_tv_status.text = "Terlalu tua untuk hamil"
                        }
                        age in 20..35 -> {
                            kuis_tv_status.text = "Usia ideal untuk hamil"
                        }
                    }
                }
            }

        })

        kuis_tv_lanjut.setOnClickListener(this)
    }

    @SuppressLint("SetTextI18n", "ResourceAsColor")
    private fun generateKuis() {
        if (indexKuis == listKuis.size) {
            finish()
            val presentase: Double = skor.toDouble() / 10.toDouble() / (listKuis.size).toDouble() * 100.toDouble()
            startActivity(intentFor<HasilActivity>("JAWABANTIDAK" to listJawabanDenganDeskripsi, "SKOR" to presentase))
        } else {
            val kuis = listKuis[indexKuis]
            kuis_tv_nomer_soal.text = "Nomer Soal ${(indexKuis + 1)}"
            kuis_tv_soal.text = kuis

            /*TODO Un-comment when need edittext view*/
//            if (indexKuis==1){
//                kuis_edt.visibility = View.VISIBLE
//                kuis_radiogrup.visibility = View.GONE
//                kuis_tv_status.visibility = View.VISIBLE
//            }else{
                kuis_edt.visibility = View.GONE
                kuis_radiogrup.visibility = View.VISIBLE
                kuis_tv_status.visibility = View.GONE
//            }

            for (i in 0 until listPilihanJawaban[indexKuis].size) {
                val radioButton = RadioButton(this)
                radioButton.id = i
                radioButton.setTextColor(resources.getColor(R.color.White))
                radioButton.text = listPilihanJawaban[indexKuis][i]
                radioButton.textSize = 16f
                kuis_radiogrup.addView(radioButton)
            }

            indexKuis++
        }
    }

    override fun onClick(view: View?) {
        when (view) {
            kuis_tv_lanjut -> {
                /*TODO Un-comment when need edittext view*/
//                if (indexKuis-1 == 1){
//                    checkEditText()
//                }else{
                    checkedAnswerDefault()
//                }

            }
        }
    }

    private fun checkEditText() {
        if (kuis_edt.text.isNullOrEmpty() || kuis_edt.text.isNullOrBlank()){
            kuis_edt.error = "Masukkan umur ibu terlebih dahulu"
            kuis_edt.requestFocus()
        }else{
            val age = kuis_edt.text.toString().toInt()
            when {
                age < 20 -> {
                    val rb = kuis_radiogrup.getChildAt(0) as RadioButton
                    rb.isChecked = true
                    checkedAnswerDefault()
                }
                age > 35 -> {
                    val rb = kuis_radiogrup.getChildAt(2) as RadioButton
                    rb.isChecked = true
                    checkedAnswerDefault()
                }
                age in 20..35 -> {
                    val rb = kuis_radiogrup.getChildAt(1) as RadioButton
                    rb.isChecked = true
                    checkedAnswerDefault()
                }
            }
        }
    }

    private fun checkedAnswerDefault(){
        if (kuis_radiogrup.checkedRadioButtonId == -1) {
            toast("Pilih jawaban dahulu")
            return
        }

        //Mendapatkan jawaban kuis
        val radioButtonId = kuis_radiogrup.checkedRadioButtonId
        val indexOfRadioButtonSelected = kuis_radiogrup.indexOfChild(kuis_radiogrup.findViewById(radioButtonId))

        //Check jawaban kuis, jika deskripsi jawabannya null maka sama dengan menjawab YA
        if (listDeskripsiJawaban[indexKuis - 1][indexOfRadioButtonSelected] == null) {
            skor += 10
            kuis_tv_skor_jawaban.text = "Skor : $skor"
        } else {
            skor += 0
            kuis_tv_skor_jawaban.text = "Skor : $skor"
            val kuisModel = KuisModel(soal = kuis_tv_soal.text.toString(),
                    judul = listJudulDeskripsiJawaban[indexKuis - 1][indexOfRadioButtonSelected],
                    deskripsi = listDeskripsiJawaban[indexKuis - 1][indexOfRadioButtonSelected])
            Log.d("KUISMODELXXX", "$kuisModel")
            listJawabanDenganDeskripsi.add(kuisModel)
        }

        //Generate Soal Selanjutnya
        kuis_radiogrup.clearCheck()
        kuis_radiogrup.removeAllViews()
        generateKuis()
    }
}
