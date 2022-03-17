package com.getsucode.ngobarV1.Materi

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.getsucode.ngobarV1.ListMateri.AndroidList
import com.getsucode.ngobarV1.ListMateri.JavaList
import com.getsucode.ngobarV1.Menu.R


class MateriAndroid : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_materi_android)

        val mulaiBelajar= findViewById<Button>(R.id.mulaiBelajar)

        mulaiBelajar.setOnClickListener {
            Intent(this, AndroidList::class.java ).also {
                startActivity(it)
            }
        }
    }
}