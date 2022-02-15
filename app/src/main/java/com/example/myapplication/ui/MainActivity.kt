package com.example.myapplication.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.R
import com.example.myapplication.apiserv.apiService
import com.example.myapplication.models.OrderStatu
import com.example.myapplication.repo.mainrepo
import com.example.myapplication.viewmdl.mainvm
import com.example.myapplication.viewmdl.vmfactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var itemlist= ArrayList<OrderStatu>()
    private lateinit var  adapter: dataadapter
    lateinit var repo: mainrepo
    lateinit var viewmode: mainvm

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        repo= mainrepo()
        val vmfactory= vmfactory(repo)
        viewmode= ViewModelProviders.of(this, vmfactory).get(mainvm::class.java)
        viewmode.gettdataa()
        viewmode.livedata.observe(this, Observer {
            itemlist= it as ArrayList<OrderStatu>
            setadapter()
        })


    }

    fun setadapter(){
        adapter= dataadapter(this, itemlist)
        val layoutmanager= LinearLayoutManager(this)
        rvrecycle.adapter= adapter
        rvrecycle.layoutManager= layoutmanager
    }
}