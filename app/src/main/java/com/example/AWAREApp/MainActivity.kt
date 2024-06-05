package com.example.AWAREApp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var btnScan: Button
    private lateinit var btnViewScans: Button
    private lateinit var btnExit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnScan = findViewById(R.id.btn_scan)
        btnViewScans = findViewById(R.id.btn_view_scans)
        btnExit = findViewById(R.id.btn_exit)

        btnScan.setOnClickListener {
            val intent = Intent(this, ScanActivity::class.java)
            startActivity(intent)
        }

        btnViewScans.setOnClickListener {
            val intent = Intent(this, ViewScansActivity::class.java)
            startActivity(intent)
        }

        btnExit.setOnClickListener {
            finishAffinity()
        }
    }
}