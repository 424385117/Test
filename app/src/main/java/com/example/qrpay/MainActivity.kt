package com.example.qrpay

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast
import android.view.View


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolbar.title = ""
        setSupportActionBar(toolbar)
        val list = initData()
        val layoutManager = LinearLayoutManager(this)
        recyclerview.setHasFixedSize(true)
        recyclerview.layoutManager = layoutManager
        val adapter = MyAdapter(list)
        recyclerview.adapter = adapter
        adapter.setOnItemClickListener(object : MyAdapter.OnItemClickListener {
            override fun onItemClick(view: View, position: Int) = toast(list[position])

        })
        btn.setOnClickListener { toast("1") }

        fun print(a: Int) = println(a)
        print(3)
    }




    private fun initData(): ArrayList<String> {
        val list = ArrayList<String>().apply{
            add("🍎")
            add("🍊")
            add("🍉")
            add("🍐")
            add("🍌")
            add("🍆")
            add("🐎")
            add("苹果")
            add("橘子")
            add("西瓜")
            add("梨")
            add("香蕉")
            add("茄子")
            add("马")
            add("🍎")
            add("🍊")
            add("🍉")
            add("🍐")
            add("🍌")
            add("🍆")
            add("🐎")
            add("苹果")
            add("橘子")
            add("西瓜")
            add("梨")
            add("香蕉")
            add("茄子")
            add("马")
            add("🍎")
            add("🍊")
            add("🍉")
            add("🍐")
            add("🍌")
            add("🍆")
            add("🐎")
            add("苹果")
            add("橘子")
            add("西瓜")
            add("梨")
            add("香蕉")
            add("茄子")
            add("马")
            add("🍎")
            add("🍊")
            add("🍉")
            add("🍐")
            add("🍌")
            add("🍆")
            add("🐎")
            add("苹果")
            add("橘子")
            add("西瓜")
            add("梨")
            add("香蕉")
            add("茄子")
            add("马")
        }
        return list
    }
}
