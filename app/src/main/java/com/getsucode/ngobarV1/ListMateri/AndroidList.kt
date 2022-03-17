package com.getsucode.ngobarV1.ListMateri

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.CardView
import com.getsucode.ngobarV1.ListMateri.SubListMateriAndroid.ListMateriAndroid1
import com.getsucode.ngobarV1.ListMateri.SubListMateriAndroid.ListMateriAndroid2
import com.getsucode.ngobarV1.ListMateri.SubListMateriAndroid.ListMateriAndroid3
import com.getsucode.ngobarV1.ListMateri.SubListMateriAndroid.ListMateriAndroid4
import com.getsucode.ngobarV1.ListMateri.SubListMateriJava.ListMateriJava1
import com.getsucode.ngobarV1.ListMateri.SubListMateriJava.ListMateriJava2
import com.getsucode.ngobarV1.ListMateri.SubListMateriJava.ListMateriJava3
import com.getsucode.ngobarV1.ListMateri.SubListMateriJava.ListMateriJava4
import com.getsucode.ngobarV1.Menu.MainActivityKT
import com.getsucode.ngobarV1.Menu.R

class AndroidList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_list)

        val btnHomeFloat = findViewById<CardView>(R.id.btnHomeFloat)


        val cvMateriAndroid1 = findViewById<CardView>(R.id.cvMateriAndroid1)
        val cvMateriAndroid2 = findViewById<CardView>(R.id.cvMateriAndroid2)
        val cvMateriAndroid3 = findViewById<CardView>(R.id.cvMateriAndroid3)
        val cvMateriAndroid4 = findViewById<CardView>(R.id.cvMateriAndroid4)

        btnHomeFloat.setOnClickListener {
            Intent(this, MainActivityKT::class.java).also{
                it.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                it.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                startActivity(it)
            }
        }

        // Materi 1
        cvMateriAndroid1.setOnClickListener {
            //Intent(this, ListMateriAndroid1::class.java).also{ }//
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/h_0FtYwrlE0"))
            startActivity(intent)

        }

        // Materi 2
        cvMateriAndroid2.setOnClickListener {
           var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/lqJVL_DeXu0"))
            startActivity(intent)
        }

        // Materi 3
        cvMateriAndroid3.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/C1BB2ibQRD0"))
            startActivity(intent)
        }

        // Materi 3
        cvMateriAndroid4.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/XB-oKEgHOwE"))
            startActivity(intent)
        }
    }
}