package com.iav.ipb.ui.kuis

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity
import com.iav.ipb.R
import com.iav.ipb.data.KuisData
import com.iav.ipb.model.KuisModel
import kotlinx.android.synthetic.main.activity_kuis.*
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.toast

class KuisActivity : AppCompatActivity(), View.OnClickListener {

    var listKuis: ArrayList<String> = ArrayList()

    var listPilihanJawaban: ArrayList<ArrayList<String>> = ArrayList()
    var listDeskripsiJawaban: ArrayList<ArrayList<String>> = ArrayList()

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
        listDeskripsiJawaban = KuisData.deskripsiJawabanSoal
        generateKuis()

        kuis_tv_lanjut.setOnClickListener(this)
    }

    @SuppressLint("SetTextI18n")
    private fun generateKuis() {
        if (indexKuis == listKuis.size) {
            finish()
            val presentase: Float = skor.toFloat() / 10 / listKuis.size * 100
            startActivity(intentFor<HasilActivity>("JAWABANTIDAK" to listJawabanDenganDeskripsi, "SKOR" to String.format("%.2f", presentase)))
        } else {
            val kuis = listKuis[indexKuis]
            kuis_tv_nomer_soal.text = "Nomer Soal ${(indexKuis + 1)}"
            kuis_tv_soal.text = kuis

            for (i in 0 until listPilihanJawaban[indexKuis].size) {
                val radioButton = RadioButton(this)
                radioButton.text = listPilihanJawaban[indexKuis][i]
                kuis_radiogrup.addView(radioButton)
            }

            indexKuis++
        }
    }

    override fun onClick(view: View?) {
        when (view) {
            kuis_tv_lanjut -> {
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
                            deskripsi = listDeskripsiJawaban[indexKuis - 1][indexOfRadioButtonSelected])
                    listJawabanDenganDeskripsi.add(kuisModel)
                }

                //Generate Soal Selanjutnya
                kuis_radiogrup.clearCheck()
                kuis_radiogrup.removeAllViews()
                generateKuis()
            }
        }
    }
}
