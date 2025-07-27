package com.ewersson.revision

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val imageView: ImageView = itemView.findViewById(R.id.img)
    val nameView: TextView = itemView.findViewById(R.id.name)
    val emailView: TextView = itemView.findViewById(R.id.email)
}
