package com.getsucode.ngobarV1.ListMateri.SubListMateriKotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.getsucode.ngobarV1.Menu.R
import com.github.barteksc.pdfviewer.PDFView

class ListMateriKotlin3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_materi_kotlin3)

        val pdf3K= findViewById<PDFView>(R.id.pdf3K)
        pdf3K.fromAsset("kotlindasar.pdf")
            .enableSwipe(true)
            .enableDoubletap(true)
            .load()
    }
}