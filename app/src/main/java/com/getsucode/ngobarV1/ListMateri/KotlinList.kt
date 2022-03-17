package com.getsucode.ngobarV1.ListMateri

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.CardView
import com.getsucode.ngobarV1.ListMateri.SubListMateriKotlin.ListMateriKotlin1
import com.getsucode.ngobarV1.ListMateri.SubListMateriKotlin.ListMateriKotlin2
import com.getsucode.ngobarV1.ListMateri.SubListMateriKotlin.ListMateriKotlin3
import com.getsucode.ngobarV1.ListMateri.SubListMateriKotlin.ListMateriKotlin4
import com.getsucode.ngobarV1.Menu.MainActivityKT
import com.getsucode.ngobarV1.Menu.R


class KotlinList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_kotlin)

        val btnHomeFloat = findViewById<CardView>(R.id.btnHomeFloat)
        val cvMateriKotlin1 = findViewById<CardView>(R.id.cvMateriKotlin1)
        val cvMateriKotlin2 = findViewById<CardView>(R.id.cvMateriKotlin2)
        val cvMateriKotlin3 = findViewById<CardView>(R.id.cvMateriKotlin3)
        val cvMateriKotlin4 = findViewById<CardView>(R.id.cvMateriKotlin4)

        btnHomeFloat.setOnClickListener {
            Intent(this, MainActivityKT::class.java).also{
                it.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                it.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                startActivity(it)
            }
        }

        // Materi 1
        cvMateriKotlin1.setOnClickListener {
            Intent(this, ListMateriKotlin1::class.java).also{
                startActivity(it)
            }
        }

        // Materi 2
        cvMateriKotlin2.setOnClickListener {
            Intent(this, ListMateriKotlin2::class.java).also{
                startActivity(it)
            }
        }

        // Materi 3
        cvMateriKotlin3.setOnClickListener {
            Intent(this, ListMateriKotlin3::class.java).also{
                startActivity(it)
            }
        }

        // Materi 3
        cvMateriKotlin4.setOnClickListener {
            Intent(this, ListMateriKotlin4::class.java).also{
                startActivity(it)
            }
        }
    }
}