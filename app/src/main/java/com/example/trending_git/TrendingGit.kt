package com.example.trending_git

import android.app.Application

class TrendingGit : Application() {

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    companion object {
        lateinit var instance: TrendingGit
    }
}