package com.getsucode.ngobarV1.ListMateri.SubListMateriAndroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.getsucode.ngobarV1.Menu.R
import com.github.barteksc.pdfviewer.PDFView

class ListMateriAndroid2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_materi_android2)

        val pdf2A= findViewById<PDFView>(R.id.pdf2A)
        pdf2A.fromAsset("modulandroid.pdf")
            .enableSwipe(true)
            .enableDoubletap(true)
            .load()
    }
}