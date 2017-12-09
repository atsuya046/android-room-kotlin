package com.example.nobu.tableinheritanceexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = User(1, "user")

        with((application as Application).database.userDao()) {
            insert(user)

            findAll().forEach { u ->
                Toast.makeText(this@MainActivity, u.name, Toast.LENGTH_SHORT).show()
            }
        }
    }

}
