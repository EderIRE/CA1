package com.ie.dorset.student_id_23761.ca1

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity


    class Education : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.education)
        }

        fun showHomeMenu(item: MenuItem) {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }

        fun showSkillsMenu(item: MenuItem) {
            val intent = Intent(this, Skills::class.java)
            startActivity(intent)

        }

        fun exit (item: MenuItem){
            finish()

        }
    }