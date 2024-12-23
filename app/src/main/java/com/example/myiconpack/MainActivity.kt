package com.example.myiconpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        finish() // Schließt die Aktivität direkt wieder, falls kein UI benötigt wird
    }
}
