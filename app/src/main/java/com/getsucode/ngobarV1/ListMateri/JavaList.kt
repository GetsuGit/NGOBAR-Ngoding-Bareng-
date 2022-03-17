package com.getsucode.ngobarV1.ListMateri

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.CardView
import com.getsucode.ngobarV1.ListMateri.SubListMateriJava.ListMateriJava1
import com.getsucode.ngobarV1.ListMateri.SubListMateriJava.ListMateriJava2
import com.getsucode.ngobarV1.ListMateri.SubListMateriJava.ListMateriJava3
import com.getsucode.ngobarV1.ListMateri.SubListMateriJava.ListMateriJava4
import com.getsucode.ngobarV1.ListMateri.SubListMateriKotlin.ListMateriKotlin1
import com.getsucode.ngobarV1.ListMateri.SubListMateriKotlin.ListMateriKotlin2
import com.getsucode.ngobarV1.ListMateri.SubListMateriKotlin.ListMateriKotlin3
import com.getsucode.ngobarV1.ListMateri.SubListMateriKotlin.ListMateriKotlin4
import com.getsucode.ngobarV1.Menu.MainActivityKT
import com.getsucode.ngobarV1.Menu.R

class JavaList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_java_list)

        val btnHomeFloat = findViewById<CardView>(R.id.btnHomeFloat)

        val cvMateriJava1 = findViewById<CardView>(R.id.cvMateriJava1)
        val cvMateriJava2 = findViewById<CardView>(R.id.cvMateriJava2)
        val cvMateriJava3 = findViewById<CardView>(R.id.cvMateriJava3)
        val cvMateriJava4 = findViewById<CardView>(R.id.cvMateriJava4)

        btnHomeFloat.setOnClickListener {
            Intent(this, MainActivityKT::class.java).also{
                it.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                it.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                startActivity(it)
            }
        }

        // Materi 1
        cvMateriJava1.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLhpi9Nh1R-DPmIs2ybL6M0k0dIJNEdoyc"))
            startActivity(intent)
        }

        // Materi 2
        cvMateriJava2.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLhpi9Nh1R-DN1gvK5ARus0HJXJUdK-jk4"))
            startActivity(intent)
        }

        // Materi 3
        cvMateriJava3.setOnClickListener {
            Intent(this, ListMateriJava3::class.java).also{
                startActivity(it)
            }
        }

        // Materi 3
        cvMateriJava4.setOnClickListener {
            Intent(this, ListMateriJava4::class.java).also{
                startActivity(it)
            }
        }
    }
}