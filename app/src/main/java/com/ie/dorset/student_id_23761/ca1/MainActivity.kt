package com.ie.dorset.student_id_23761.ca1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        }

    fun showSkills ( view : View)    {
        val intent = Intent(this, Skills::class.java)
        startActivity(intent)

    }

    fun showEducation ( view : View)    {
        val intent = Intent(this, Education::class.java)
        startActivity(intent)

    }

    fun showHobbies ( view : View)    {
        val intent = Intent(this, Hobbies::class.java)
        startActivity(intent)

    }

    fun showAchievements ( view : View)    {
        val intent = Intent(this, Achievements::class.java)
        startActivity(intent)

    }

    fun exit (view: View){
        exitProcess(0)
    }






}