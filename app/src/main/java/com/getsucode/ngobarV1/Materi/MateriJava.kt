package com.getsucode.ngobarV1.Materi

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.getsucode.ngobarV1.ListMateri.JavaList
import com.getsucode.ngobarV1.ListMateri.KotlinList
import com.getsucode.ngobarV1.Menu.R

class MateriJava : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_materi_java)

        val mulaiBelajarJava = findViewById<Button>(R.id.mulaiBelajarJava)

        mulaiBelajarJava.setOnClickListener {
            Intent(this, JavaList::class.java ).also {
                startActivity(it)
            }
        }
    }
}