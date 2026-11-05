package com.example.shopapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        val products = listOf(
            Product("كاميرا", 250.0, R.drawable.camera1),
            Product("كاميرا احترافية", 450.0, R.drawable.camera2),
            Product("سماعات", 80.0, R.drawable.headphones),
            Product("ساعة ذكية", 120.0, R.drawable.watch),
            Product("لابتوب", 900.0, R.drawable.laptop),
            Product("جوال", 600.0, R.drawable.phone)
        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ProductAdapter(products)
    }
}
