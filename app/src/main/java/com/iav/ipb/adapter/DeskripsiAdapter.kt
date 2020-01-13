package com.iav.ipb.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.iav.ipb.R
import kotlinx.android.synthetic.main.view_deskripsi.view.*

class DeskripsiAdapter(var list: ArrayList<String>?) : RecyclerView.Adapter<DeskripsiAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.view_deskripsi, parent, false))

    override fun getItemCount(): Int = list?.size ?: 0

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.clear()
        holder.bind(position)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(position: Int) {
            val text = list?.get(position)?.replace("*","")
            itemView.tv_saran.text = text

            if (!list?.get(position)!!.contains("*")){
                itemView.tv_bintang.visibility = View.GONE
            }else{
                itemView.tv_bintang.visibility = View.VISIBLE
            }
        }

        fun clear() {
            itemView.tv_bintang.visibility = View.VISIBLE
        }
    }

}