package com.iav.ipb.ui.kuis

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.iav.ipb.R
import com.iav.ipb.adapter.HasilAdapter
import com.iav.ipb.model.KuisModel
import kotlinx.android.synthetic.main.activity_hasil.*

class HasilActivity : AppCompatActivity() {

    var listIndexJawabanTidak: ArrayList<KuisModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil)
        supportActionBar?.hide()

        listIndexJawabanTidak = intent.getParcelableArrayListExtra("JAWABANTIDAK")
        checkListIsEmpty()

        val skor = intent.getDoubleExtra("SKOR", (-1).toDouble())

        Log.d("SKOR", "$skor")
        var status = ""
        if (skor >= 76.toDouble() && skor <= 100.toDouble()) {
            status = "AMAN"
            Glide.with(this)
                    .load(R.drawable.aman)
                    .into(iv_gambar)
        } else if (skor >= 56.toDouble() && skor <= 75.toDouble()) {
            status = "WASPADA"
            Glide.with(this)
                    .load(R.drawable.waspada)
                    .into(iv_gambar)
        } else if (skor <= 55.toDouble()) {
            status = "BERBAHAYA"
            Glide.with(this)
                    .load(R.drawable.berbahaya_1)
                    .into(iv_gambar)
        }
        hasil_tv_skor.text = status

        aturRecyclerView()
    }

    private fun checkListIsEmpty() {
        if (listIndexJawabanTidak?.size == 0) {
            hasil_rv_deskripsi.visibility = View.GONE
            hasil_iv_empty.visibility = View.VISIBLE
        } else {
            hasil_rv_deskripsi.visibility = View.VISIBLE
            hasil_iv_empty.visibility = View.GONE
        }
    }

    private fun aturRecyclerView() {
        //Mendapatkan soal dan deskripsi dari jawaban tidak
//        val listData : ArrayList<KuisModel> = ArrayList()
//        for (i in 0 until listIndexJawabanTidak?.size!!){
//            val kuisModel = KuisModel(
//                    soal = KuisData.kuisSoal[listIndexJawabanTidak?.get(i)!!],
//                    deskripsi = KuisData.kuisDeskripsi[listIndexJawabanTidak?.get(i)!!],
//                    visibility = false
//            )
//            Log.d("HASILKUIS", kuisModel.toString())
//            listData.add(kuisModel)
//        }

        val lm = LinearLayoutManager(this)
        val adapter = HasilAdapter(listIndexJawabanTidak)
        hasil_rv_deskripsi.layoutManager = lm
        hasil_rv_deskripsi.adapter = adapter

    }
}
