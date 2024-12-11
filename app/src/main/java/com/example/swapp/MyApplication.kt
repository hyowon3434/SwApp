package com.example.swapp

import android.app.Application

class MyApplication: Application() {
    lateinit var database: DatabaseHelper

    override fun onCreate() {
        super.onCreate()
        database = DatabaseHelper(this)
    }
}