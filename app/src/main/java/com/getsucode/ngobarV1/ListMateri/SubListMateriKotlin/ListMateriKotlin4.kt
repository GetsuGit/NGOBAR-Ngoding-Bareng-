package com.getsucode.ngobarV1.ListMateri.SubListMateriKotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.getsucode.ngobarV1.Menu.R
import com.github.barteksc.pdfviewer.PDFView

class ListMateriKotlin4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_materi_kotlin4)

        val pdf4K= findViewById<PDFView>(R.id.pdf4K)
        pdf4K.fromAsset("kotlindasar.pdf")
            .enableSwipe(true)
            .enableDoubletap(true)
            .load()
    }
}