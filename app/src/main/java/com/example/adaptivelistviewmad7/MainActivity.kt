package com.example.adaptivelistviewmad7

import android.app.AlertDialog
import android.os.Bundle
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

data class Fruit(
    val name: String,
    val desc: String,
    val price: String,
    val imageRes: Int
)

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fruits = listOf(
            Fruit("Apple", "Crisp and sweet", "₹120/kg", R.drawable.fruit_apple),
            Fruit("Banana", "Rich in potassium", "₹50/dozen", R.drawable.fruit_banana),
            Fruit("Grapes", "Seedless, juicy", "₹90/kg", R.drawable.fruit_grapes),
            Fruit("Mango", "King of fruits", "₹150/kg", R.drawable.fruit_mango),
            Fruit("Orange", "Vitamin C boost", "₹80/kg", R.drawable.fruit_orange),
            Fruit("Watermelon", "Refreshing summer fruit", "₹40/kg", R.drawable.fruit_watermelon)
        )

        val listView = findViewById<ListView>(R.id.listView)
        listView.adapter = MyAdapter(this, fruits)

        listView.setOnItemClickListener { _, _, position, _ ->
            showFruitDialog(fruits[position])
        }
    }

    private fun showFruitDialog(fruit: Fruit) {
        val dialogView = layoutInflater.inflate(R.layout.dialog_fruit, null)
        dialogView.findViewById<ImageView>(R.id.imgDialog).setImageResource(fruit.imageRes)
        dialogView.findViewById<TextView>(R.id.tvDialogName).text = fruit.name

        AlertDialog.Builder(this)
            .setView(dialogView)
            .setNegativeButton("CLOSE") { d, _ -> d.dismiss() }
            .show()
    }
}