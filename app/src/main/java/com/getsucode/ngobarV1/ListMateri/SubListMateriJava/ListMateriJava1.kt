package com.getsucode.ngobarV1.ListMateri.SubListMateriJava

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.getsucode.ngobarV1.Menu.R
import com.github.barteksc.pdfviewer.PDFView

class ListMateriJava1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_materi_java1)

        val pdf1Java= findViewById<PDFView>(R.id.pdf1Java)
        pdf1Java.fromAsset("javadasar.pdf")
            .enableSwipe(true)
            .enableDoubletap(true)
            .load()
    }
}