package com.iav.ipb.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.iav.ipb.R
import com.iav.ipb.model.KuisModel
import kotlinx.android.synthetic.main.view_hasil.view.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class HasilAdapter(var list: ArrayList<KuisModel>?) : RecyclerView.Adapter<HasilAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.view_hasil, parent, false))

    override fun getItemCount(): Int = list?.size ?: 0

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(position)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(position: Int) {
            itemView.vh_tv_soal.text = list?.get(position)?.soal
            itemView.vh_tv_deskripsi.text = list?.get(position)?.deskripsi

            aturVisibility(position)

            itemView.vh_tv_soal.onClick {
                list?.get(position)?.visibility = !list?.get(position)?.visibility!!
                notifyDataSetChanged()
                aturVisibility(position)
            }
        }

        fun aturVisibility(position: Int) {
            if (list?.get(position)?.visibility!!) {
                itemView.vh_tv_deskripsi.visibility = View.VISIBLE
            } else {
                itemView.vh_tv_deskripsi.visibility = View.GONE
            }
        }
    }

}