package com.example.myapplication.models

data class RespModel(
    val error: Boolean,
    val error_code: Int,
    val message: String,
    val order_status: List<OrderStatu>
)