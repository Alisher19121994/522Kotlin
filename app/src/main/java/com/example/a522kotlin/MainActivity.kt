package com.example.a522kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        recyclerView = findViewById(R.id.recyclerview_id)
        recyclerView.layoutManager = GridLayoutManager(this, 1)

            val listSet = ArrayList<Chats>()
            listSet.add(Chats(R.drawable.rasm, "Alisher Daminov To'lqinovich", 23))
            listSet.add(Chats(R.drawable.rasm1, "Said Ddddov ", 83))
            listSet.add(Chats(R.drawable.rasm2, "Ali aminov ", 26))
            listSet.add(Chats(R.drawable.rasm3, "Alisher  ", 293))
            listSet.add(Chats(R.drawable.rasm4, "Alisheyx ", 203))
            listSet.add(Chats(R.drawable.rasm5, "Abbos Daminov To'lqinovich", 2663))
            listSet.add(Chats(R.drawable.rasm6, "Bekzod  ", 2))
            listSet.add(Chats(R.drawable.rasm7, "Alisher Daminov To'lqinovich", 233))
            listSet.add(Chats(R.drawable.rasm, "Alex ", 2))
            listSet.add(Chats(R.drawable.rasm, "jack Dawson", 3))
            listSet.add(Chats(R.drawable.rasm, "jack Dawson", 3))
            listSet.add(Chats(R.drawable.rasm, "jack Dawson", 3))
            listSet.add(Chats(R.drawable.rasm, "jack Dawson", 3))
            listSet.add(Chats(R.drawable.rasm, "jack Dawson", 3))
            listSet.add(Chats(R.drawable.rasm, "jack Dawson", 3))
            listSet.add(Chats(R.drawable.rasm, "jack Dawson", 3))
            listSet.add(Chats(R.drawable.rasm, "jack Dawson", 3))
            listSet.add(Chats(R.drawable.rasm, "jack Dawson", 3))
            listSet.add(Chats(R.drawable.rasm, "jack Dawson", 3))

            val adapters = ChatsAdapter(this, listSet)
            recyclerView.adapter = adapters
        }
    }
