package com.ewersson.revision

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.rv_main)

        val itemList = listOf(
            Item("John", "john@email.com", R.drawable.john),
            Item("Ed", "ed@gmail.com", R.drawable.ed),
            Item("Vlad", "vlad@gmail.com", R.drawable.vlad)
        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = Adapter(applicationContext, itemList)
    }
}
