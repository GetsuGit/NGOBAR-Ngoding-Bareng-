package com.getsucode.ngobarV1.Menu

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.CardView
import android.view.View
import android.widget.GridLayout
import android.widget.Toast
import com.getsucode.ngobarV1.Materi.MateriAndroid
import com.getsucode.ngobarV1.Materi.MateriJava
import com.getsucode.ngobarV1.Materi.MateriKotlin


class MainActivityKT : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_kt)
        val mainGrid = findViewById<View>(R.id.mainGrid) as GridLayout

        val cdHome = findViewById<CardView>(R.id.cdHome)
        val cdBelajarKotlin = findViewById<CardView>(R.id.cdBelajarKotlin)
        val cdBelajarJava = findViewById<CardView>(R.id.cdBelajarJava)
        val cdBelajarAndroid = findViewById<CardView>(R.id.cdBelajarAndroid)

        // about
        cdHome.setOnClickListener {
            Intent(this, AboutActivity::class.java).also{
                startActivity(it)
            }
        }

       //Belajar kotlin
        cdBelajarKotlin.setOnClickListener {
            Intent(this, MateriKotlin::class.java).also{
                startActivity(it)
            }
        }

      //Belajar java
        cdBelajarJava.setOnClickListener {
            Intent(this, MateriJava::class.java).also{
                startActivity(it)
            }
        }

        //Belajar android
        cdBelajarAndroid.setOnClickListener {
            Intent(this, MateriAndroid::class.java).also{
                startActivity(it)
            }
        }
    }

    override fun onBackPressed() {
        val builder = AlertDialog.Builder(this)
        builder.setIcon(R.drawable.ngobarlogo)

        builder.setTitle("Keluar")
        builder.setMessage("Yah kok udahan?")
        builder.setPositiveButton(
            "Ya"
        ) { dialogInterface, i -> finish() }

        builder.setNegativeButton("Gak jadi deh", null)
        val alertDialog = builder.create()
        alertDialog.show()

    }

}