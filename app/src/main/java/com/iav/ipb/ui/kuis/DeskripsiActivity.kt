package com.iav.ipb.ui.kuis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.iav.ipb.R
import com.iav.ipb.adapter.DeskripsiAdapter
import com.iav.ipb.model.KuisModel
import kotlinx.android.synthetic.main.activity_deskripsi.*

class DeskripsiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deskripsi)

        val kuisModel = intent.getParcelableExtra<KuisModel>("DESKRIPSI")

        tv_title.text = kuisModel.judul

        val adapter = DeskripsiAdapter(kuisModel.deskripsi)
        val lm = LinearLayoutManager(this)
        rv_saran.layoutManager = lm
        rv_saran.adapter = adapter
    }
}
