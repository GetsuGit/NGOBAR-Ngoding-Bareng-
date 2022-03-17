package com.getsucode.ngobarV1.ListMateri.SubListMateriKotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.getsucode.ngobarV1.Menu.R
import com.github.barteksc.pdfviewer.PDFView

class ListMateriKotlin1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_materi1)

        val pdf1= findViewById<PDFView>(R.id.pdf1)
        pdf1.fromAsset("kotlindasar.pdf")
            .enableSwipe(true)
            .enableDoubletap(true)
            .load()
    }
}