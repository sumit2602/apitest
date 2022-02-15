package com.example.myapplication.viewmdl

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.repo.mainrepo

class vmfactory(val repo: mainrepo): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return mainvm(repo) as T
    }
}