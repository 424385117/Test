package com.example.qrpay

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.recy_list_item.view.*


/**
 * Created by 秦文浩 on 2017/6/5.
 */
class MyAdapter(val items: List<String>) : RecyclerView.Adapter<MyAdapter.ViewHolder>(), View.OnClickListener {
    override fun onClick(v: View?) {
        if (v != null) {
            mOnItemClickListener?.onItemClick(v, v.tag as Int)
        }
    }

    private var mOnItemClickListener: OnItemClickListener? = null
    override fun getItemCount(): Int = items.size
    fun setOnItemClickListener(listener: OnItemClickListener) {
        this.mOnItemClickListener = listener
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0.view.textview.text = items[p1]
        //将position保存在itemView的Tag中，以便点击时进行获取
        p0.itemView.tag = p1
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val view = LayoutInflater.from(p0.context)
                .inflate(R.layout.recy_list_item, p0, false)
        val holder = ViewHolder(view as LinearLayout)
        view.setOnClickListener(this)
        return holder
    }

    class ViewHolder(val view: LinearLayout) : RecyclerView.ViewHolder(view)
    interface OnItemClickListener {
        fun onItemClick (view: View, position: Int)
    }

}