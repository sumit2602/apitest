package com.example.myapplication.repo

import com.example.myapplication.apiserv.Network
import com.example.myapplication.apiserv.apiService
import com.example.myapplication.models.OrderStatu
import com.example.myapplication.models.RespModel

class mainrepo() {


    suspend fun getapidata(): List<OrderStatu>{
        return Network.getapiservice().getdata().order_status
    }
}