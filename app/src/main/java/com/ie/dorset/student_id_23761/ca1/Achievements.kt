package com.ie.dorset.student_id_23761.ca1

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Achievements : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.achievements)


    }

    fun showHobbiesMenu(item: MenuItem) {
        val intent = Intent(this, Hobbies::class.java)
        startActivity(intent)


    }

    fun showHomeMenu(item: MenuItem) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)

    }

    fun exit (item: MenuItem){
        finish()

    }
}