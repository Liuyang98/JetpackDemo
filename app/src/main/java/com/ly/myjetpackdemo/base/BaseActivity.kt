package com.ly.myjetpackdemo.base

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.ly.myjetpackdemo.config.App

@SuppressLint("Registered")
open class BaseActivity : AppCompatActivity() {

    protected open fun getAppViewModelProvider(activity: BaseActivity): ViewModelProvider? {
        return (applicationContext as App).getAppViewModelProvider(this)
    }

}