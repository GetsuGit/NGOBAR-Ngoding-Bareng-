package com.getsucode.ngobarV1.Materi

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.getsucode.ngobarV1.ListMateri.JavaList
import com.getsucode.ngobarV1.ListMateri.KotlinList
import com.getsucode.ngobarV1.Menu.R


class MateriKotlin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_materi_kotlin)

        val mulaiBelajarKotlin= findViewById<Button>(R.id.mulaiBelajarKotlin)

        mulaiBelajarKotlin.setOnClickListener {
            Intent(this, KotlinList::class.java ).also {
                startActivity(it)
            }
        }
    }
}