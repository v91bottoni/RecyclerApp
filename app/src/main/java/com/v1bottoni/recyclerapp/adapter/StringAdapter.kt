package com.v1bottoni.recyclerapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.v1bottoni.recyclerapp.R

class StringAdapter(val list: List<String>, var onItemClick: ((String)-> Unit)) : RecyclerView.Adapter<StringAdapter.StringViewHolder>() {

    inner class StringViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView

        init {
            textView = view.findViewById(R.id.item_text)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StringViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.layout_string, parent, false)

        return StringViewHolder(view)
    }

    override fun onBindViewHolder(holder: StringViewHolder, position: Int) {
        val message = list[position]
        holder.textView.text = message
        holder.textView.setOnClickListener{

        }
        holder.itemView.setOnClickListener {
            onItemClick.invoke("Ciao io sono $message")
        }
    }

    override fun getItemCount(): Int = list.size

}