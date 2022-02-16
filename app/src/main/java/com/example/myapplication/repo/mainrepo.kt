package com.example.myapplication.repo

import com.example.myapplication.apiserv.Network
import com.example.myapplication.apiserv.apiService
import com.example.myapplication.models.OrderStatu
import com.example.myapplication.models.RespModel

class mainrepo() {


    suspend fun getapidata(): RespModel {
        return Network.getapiservice().getdata("9", "752b1a44c8f596b65b98305627481261", "100011" )
    }
}
// sumit rai