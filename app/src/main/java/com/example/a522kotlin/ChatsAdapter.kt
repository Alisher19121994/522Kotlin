package com.example.a522kotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class ChatsAdapter(var contect: Context, var list: ArrayList<Chats>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    inner class MyViews(item: View) : RecyclerView.ViewHolder(item) {
        val profile: ShapeableImageView = item.findViewById(R.id.iv_image)
        val fullname: TextView = item.findViewById(R.id.fullname)
        val tv_count: TextView = item.findViewById(R.id.tv_count)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_view_adapter_recyclerview, parent, false)
        return MyViews(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val chats = list[position]
        if (holder is MyViews) {
            holder.profile.setImageResource(chats.profile)
            holder.fullname.text = chats.fullname
            holder.tv_count.text = chats.messageNumber.toString()

            if (chats.messageNumber in 1..8) {
                holder.tv_count.visibility = View.VISIBLE
                if (chats.messageNumber==chats.messageNumber){
                    holder.tv_count.text="+ ${holder.tv_count}"
                }
            } else {
                holder.tv_count.visibility = View.GONE
            }

        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}