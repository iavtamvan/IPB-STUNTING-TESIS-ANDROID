package com.iav.ipb.ui.kuis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.iav.ipb.R
import com.iav.ipb.adapter.HasilAdapter
import com.iav.ipb.data.KuisData
import com.iav.ipb.model.KuisModel
import kotlinx.android.synthetic.main.activity_hasil.*

class HasilActivity : AppCompatActivity() {

    var listIndexJawabanTidak : ArrayList<Int>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil)

        listIndexJawabanTidak = intent.getIntegerArrayListExtra("JAWABANTIDAK")
        checkListIsEmpty()

        val skor = intent.getIntExtra("SKOR", 0)
        hasil_tv_skor.text = "$skor"

        aturRecyclerView()
    }

    private fun checkListIsEmpty() {
        if (listIndexJawabanTidak?.size == 0){
            hasil_rv_deskripsi.visibility = View.GONE
            hasil_iv_empty.visibility = View.VISIBLE
        }else{
            hasil_rv_deskripsi.visibility = View.VISIBLE
            hasil_iv_empty.visibility = View.GONE
        }
    }

    private fun aturRecyclerView() {
        //Mendapatkan soal dan deskripsi dari jawaban tidak
        val listData : ArrayList<KuisModel> = ArrayList()
        for (i in 0 until listIndexJawabanTidak?.size!!){
            val kuisModel = KuisModel(
                    soal = KuisData.kuisSoal[listIndexJawabanTidak?.get(i)!!],
                    deskripsi = KuisData.kuisDeskripsi[listIndexJawabanTidak?.get(i)!!],
                    visibility = false
            )
            Log.d("HASILKUIS", kuisModel.toString())
            listData.add(kuisModel)
        }

        val lm = LinearLayoutManager(this)
        val adapter = HasilAdapter(listData)
        hasil_rv_deskripsi.layoutManager = lm
        hasil_rv_deskripsi.adapter = adapter

    }
}
