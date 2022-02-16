package com.example.myapplication.apiserv

import com.example.myapplication.models.OrderStatu
import com.example.myapplication.models.RespModel
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface apiService {

    @FormUrlEncoded
    @POST("api/method/chatbotGetOrderStatus.inc.php")
    suspend fun getdata(
        @Field("accountId") accountId: String?,
        @Field("accessToken") accessToken: String?,
        @Field("orderId") orderId: String?
    ): RespModel

}