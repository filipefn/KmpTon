package org.example.kmpton

import android.app.Application
import di.KoinInitializer

class MyApp: Application() {
    override fun onCreate() {
        super.onCreate()
        KoinInitializer(applicationContext).init()
    }
}