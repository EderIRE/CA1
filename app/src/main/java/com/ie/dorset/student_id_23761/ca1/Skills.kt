package com.ie.dorset.student_id_23761.ca1

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import kotlin.system.exitProcess

class Skills : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.skills)
    }

    fun showEduMenu(item: MenuItem) {
        val intent = Intent(this, Education::class.java)
        startActivity(intent)
        finish()

    }

    fun showHomeMenu(item: MenuItem) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()

    }

    fun showHobbiesMenu(item: MenuItem) {
        val intent = Intent(this, Hobbies::class.java)
        startActivity(intent)
        finish()

    }

    fun exit (item: MenuItem){
        finish()


    }


}