package com.example.retrofitinkotlinwithrecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class PostItemAdapter(val postList: List<Post>, val context: Context) :
    RecyclerView.Adapter<PostItemAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.post_item_layout,
            parent, false))

    }

    override fun getItemCount(): Int {
        return 6
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
   holder.tvID.text=postList.get(position).toString()
        holder.tvemail.text=postList.get(position).toString()
        holder.tvfirstname.text=postList.get(position).toString()
        holder.tvlastname.text=postList.get(position).toString()


    }
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)
    {
        val tvID =view.findViewById<TextView>(R.id.textview1)
        val tvemail =view.findViewById<TextView>(R.id.textview2)
        val tvfirstname =view.findViewById<TextView>(R.id.textview3)
        val tvlastname=view.findViewById<TextView>(R.id.textview4)

    }

}