package com.example.projectandroidmas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class KlubAdapter (private val klubList: ArrayList<DataClub>): RecyclerView.Adapter<KlubAdapter.MyViewHolder>(){

    private lateinit var mListener: onItemClickListener

    interface  onItemClickListener{
        fun onItemClick(position: Int)
    }

    fun setOnItemClickListener(listener: onItemClickListener){
        mListener = listener
    }

    class MyViewHolder(itemView: View, listener: onItemClickListener) : RecyclerView.ViewHolder(itemView){
        val gambar:ImageView = itemView.findViewById(R.id.imgKlub)
        val nmKlub:TextView = itemView.findViewById(R.id.jdlKlub)

        init {
            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val  itemView = LayoutInflater.from(parent.context).inflate(R.layout.data_list_club,parent, false)
        return MyViewHolder(itemView, mListener)
    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = klubList[position]
         holder.gambar.setImageResource(currentItem.img)
         holder.nmKlub.text = currentItem.namaKlub

    }

    override fun getItemCount(): Int {
        return klubList.size
    }


}