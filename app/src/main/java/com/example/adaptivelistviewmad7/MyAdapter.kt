package com.example.adaptivelistviewmad7

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(
    context: Context,
    private val fruits: List<Fruit>
) : ArrayAdapter<Fruit>(context, R.layout.list_item, fruits) {

    private val inflater: LayoutInflater = LayoutInflater.from(context)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: inflater.inflate(R.layout.list_item, parent, false)

        val imgIcon = view.findViewById<ImageView>(R.id.imgIcon)
        val tvName = view.findViewById<TextView>(R.id.tvName)
        val tvDesc = view.findViewById<TextView>(R.id.tvDesc)
        val tvPrice = view.findViewById<TextView>(R.id.tvPrice)

        val fruit = fruits[position]
        imgIcon.setImageResource(fruit.imageRes)
        tvName.text = fruit.name
        tvDesc.text = fruit.desc
        tvPrice.text = fruit.price

        return view
    }
}