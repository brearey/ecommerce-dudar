package ru.oktemsec.ecommercedudar.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ru.oktemsec.ecommercedudar.R
import ru.oktemsec.ecommercedudar.model.Category

class CategoryAdapter(private  val names : List<String>) : RecyclerView.Adapter<CategoryAdapter.MyViewHolder>() {


    class MyViewHolder (itemView : View) : RecyclerView.ViewHolder (itemView) {
        var largeTextView : TextView? = null
        init {
            largeTextView = itemView.findViewById(R.id.textViewLarge)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.largeTextView?.text = names[position]
    }

    override fun getItemCount(): Int {
        return names.size
    }
}