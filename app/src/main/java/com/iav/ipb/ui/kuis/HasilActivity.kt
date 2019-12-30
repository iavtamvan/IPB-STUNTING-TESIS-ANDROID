package com.iav.ipb.ui.kuis

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.iav.ipb.R
import com.iav.ipb.adapter.HasilAdapter
import com.iav.ipb.model.KuisModel
import kotlinx.android.synthetic.main.activity_hasil.*

class HasilActivity : AppCompatActivity() {

    var listIndexJawabanTidak: ArrayList<KuisModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil)

        listIndexJawabanTidak = intent.getParcelableArrayListExtra("JAWABANTIDAK")
        checkListIsEmpty()

        val skor = intent.getStringExtra("SKOR")

        Log.d("SKOR", "${skor.toDouble()}")
        var status = ""
        if (skor.toDouble() >= 76.toDouble() && skor.toDouble() <= 100.toDouble()) {
            status = "AMAN"
        } else if (skor.toDouble() >= 56.toDouble() && skor.toDouble() <= 75.toDouble()) {
            status = "WASPADA"
        } else if (skor.toDouble() <= 55.toDouble()){
            status = "BERBAHAYA"
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
