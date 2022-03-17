package com.getsucode.ngobarV1.ListMateri.SubListMateriJava

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.getsucode.ngobarV1.Menu.R
import com.github.barteksc.pdfviewer.PDFView

class ListMateriJava4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_materi_java4)

        val pdf4Java= findViewById<PDFView>(R.id.pdf4Java)
        pdf4Java.fromAsset("javadekstop.pdf")
            .enableSwipe(true)
            .enableDoubletap(true)
            .load()
    }
}