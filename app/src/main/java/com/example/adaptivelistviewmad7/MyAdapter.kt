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
    private val names: Array<String>,
    private val images: IntArray
) : ArrayAdapter<String>(context, R.layout.list_item, names) {

    private val inflater: LayoutInflater =
        context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: inflater.inflate(R.layout.list_item, parent, false)

        val imgIcon = view.findViewById<ImageView>(R.id.imgIcon)
        val tvName = view.findViewById<TextView>(R.id.tvName)

        tvName.text = names[position]
        imgIcon.setImageResource(images[position])

        return view
    }
}