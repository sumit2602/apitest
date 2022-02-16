package com.example.myapplication.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.models.OrderStatu
import com.example.myapplication.models.RespModel


class dataadapter(private val context: Context, private var datalist: ArrayList<OrderStatu>): RecyclerView.Adapter<dataviewholder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): dataviewholder {
        val itemview= LayoutInflater.from(context).inflate(R.layout.itemlayout, parent,false)
        return dataviewholder(itemview)
    }

    override fun onBindViewHolder(holder: dataviewholder, position: Int) {
        val moddel= datalist[position]
        holder.setdata(moddel)
    }

    override fun getItemCount(): Int {
        return datalist.size
    }
}