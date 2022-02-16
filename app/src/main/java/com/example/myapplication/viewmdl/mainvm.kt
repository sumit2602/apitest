package com.example.myapplication.viewmdl

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.models.OrderStatu
import com.example.myapplication.models.RespModel
import com.example.myapplication.repo.mainrepo
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class mainvm(val repo: mainrepo): ViewModel() {


    private var mutabledata= MutableLiveData<RespModel>()
    var livedata: MutableLiveData<RespModel> = mutabledata


    fun gettdataa(){
        CoroutineScope(Dispatchers.IO).launch {
            val itemdataa= repo.getapidata()
            mutabledata.postValue(itemdataa)
        }
    }

}