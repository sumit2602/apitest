package com.example.myapplication.apiserv

import com.example.myapplication.models.OrderStatu
import com.example.myapplication.models.RespModel
import retrofit2.http.GET

interface apiService {

    @GET("api/method/chatbotGetOrderStatus.inc.php")
    suspend fun getdata(): RespModel
}