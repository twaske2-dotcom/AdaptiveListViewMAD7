package com.example.adaptivelistviewmad7

import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)

        val fruitNames = arrayOf("Apple", "Banana", "Grapes", "Mango", "Orange", "Pineapple")

        // Using built-in Android icons so no extra images need to be added
        val fruitImages = intArrayOf(
            android.R.drawable.ic_menu_gallery,
            android.R.drawable.ic_menu_gallery,
            android.R.drawable.ic_menu_gallery,
            android.R.drawable.ic_menu_gallery,
            android.R.drawable.ic_menu_gallery,
            android.R.drawable.ic_menu_gallery
        )

        val adapter = MyAdapter(this, fruitNames, fruitImages)
        listView.adapter = adapter

        listView.setOnItemClickListener { _, _, position, _ ->
            Toast.makeText(this, "You selected: ${fruitNames[position]}", Toast.LENGTH_SHORT).show()
        }
    }
}