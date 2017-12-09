package com.example.nobu.tableinheritanceexample

import android.app.Application
import android.arch.persistence.room.Room

class Application : Application() {

    lateinit var database : AppDatabase

    override fun onCreate() {
        super.onCreate()

        database = Room.databaseBuilder(applicationContext, AppDatabase::class.java, "my_database")
                .allowMainThreadQueries()
                .build()
    }

}