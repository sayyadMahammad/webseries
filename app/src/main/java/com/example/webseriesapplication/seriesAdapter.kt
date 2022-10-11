package com.example.webseriesapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter

class seriesAdapter( var about : ArrayList<String>,var posterList: ArrayList<Int>, private val seasonsList: ArrayList<String>, var names: ArrayList<String> ,
                     var item : onItemClicked,context : Context) : Adapter<itemHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): itemHolder {
       var view : View = LayoutInflater.from(parent.context).inflate(R.layout.items,parent,false)

        var returnItem = itemHolder(view)
        view.setOnClickListener{
        item.itemClicked(posterList[returnItem.adapterPosition],names[returnItem.adapterPosition],about[returnItem.adapterPosition])

        }

        return returnItem
    }

    override fun onBindViewHolder(holder: itemHolder, position: Int) {
        holder.poster.setImageResource(posterList.get(position))
        holder.seasons.text=seasonsList.get(position)
        holder.name.text=names.get(position)


    }

    override fun getItemCount(): Int {
        return posterList.size

    }
}
class itemHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    var poster : ImageView = itemView.findViewById(R.id.imageView)
    var seasons  : TextView =itemView.findViewById(R.id.seasons)
    var name : TextView = itemView.findViewById(R.id.seriestitle)
    //var cardview : View = itemView.findViewById(R.id.cardview)

}

interface onItemClicked{
    fun itemClicked(poster: Int,posterTitle : String,posterDesc : String)


}