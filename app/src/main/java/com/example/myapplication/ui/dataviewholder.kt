package com.example.myapplication.ui

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.models.OrderStatu
import com.example.myapplication.models.RespModel
import kotlinx.android.synthetic.main.itemlayout.view.*

class dataviewholder(val view:View): RecyclerView.ViewHolder(view) {

    fun setdata(resp: OrderStatu){
        view.tvrvtext.text= resp.address_id
    }
}