package com.iav.ipb.ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.iav.ipb.R
import com.iav.ipb.data.KuisData
import kotlinx.android.synthetic.main.activity_kuis.*
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.toast

class KuisActivity : AppCompatActivity(), View.OnClickListener {

    var listKuis: ArrayList<String> = ArrayList()
    var indexKuis = 0
    var skor = 0
    var listIndexSoalJawabanTidak: ArrayList<Int> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kuis)

        listKuis = KuisData.kuisSoal
        generateKuis()

        kuis_tv_tidak.setOnClickListener(this)
        kuis_tv_ya.setOnClickListener(this)
    }

    @SuppressLint("SetTextI18n")
    private fun generateKuis() {
        if (indexKuis == listKuis.size) {
            finish()
            startActivity(intentFor<HasilActivity>("JAWABANTIDAK" to listIndexSoalJawabanTidak, "SKOR" to skor))
        } else {
            val kuis = listKuis[indexKuis]
            kuis_tv_nomer_soal.text = "Nomer Soal ${(indexKuis + 1)}"
            kuis_tv_soal.text = kuis
            indexKuis++
        }
    }

    override fun onClick(view: View?) {
        when (view) {
            kuis_tv_tidak -> clickNo()
            kuis_tv_ya -> clickYes()
        }
    }

    private fun clickYes() {
        skor += 10
        kuis_tv_skor_jawaban.text = "Skor : $skor"
        generateKuis()
    }

    private fun clickNo() {
        skor += 0
        kuis_tv_skor_jawaban.text = "Skor : $skor"
        listIndexSoalJawabanTidak.add(indexKuis-1)
        Log.d("INDEXKUIS", "index" +(indexKuis-1))

        generateKuis()
    }
}
