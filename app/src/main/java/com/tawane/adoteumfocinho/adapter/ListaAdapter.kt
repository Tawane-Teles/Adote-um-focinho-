package com.tawane.adoteumfocinho.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.tawane.adoteumfocinho.R

class ListaAdapter(nameList: List<String>, private var ctx: Context) :
        RecyclerView.Adapter<ListaAdapter.ViewHolder>() {

    private var nameList: List<String> = ArrayList<String>()

    init {
        this.nameList = nameList
    }

    // Aqui é onde o viewholder é criado a partir do layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(ctx).inflate(R.layout.content_list, parent, false)
        return ViewHolder(view)
    }

    // Nessa parte é onde se modifica o item do viewholder
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val name = nameList[position]

        holder.name.text = name

        // Verifica se o nome for igual a Emy seta a cor e a imagem em si
        if (name == "Amora") {
            holder.name.setTextColor(ContextCompat.getColor(ctx, R.color.colorCledy))
            holder.imagem.setBackgroundResource(R.drawable.img_caoum)
        }

        // Verifica se o nome for igual a Cledy seta a cor e a imagem em si
        if (name == "Junior") {
            holder.name.setTextColor(ContextCompat.getColor(ctx, R.color.colorCledy))
            holder.imagem.setBackgroundResource(R.drawable.img_caodois)
        }
        if (name == "Ane") {
            holder.name.setTextColor(ContextCompat.getColor(ctx, R.color.purple_200))
            holder.imagem.setBackgroundResource(R.drawable.ic_baseline_sick_24)
        }
        if (name == "Tiaguinho") {
            holder.name.setTextColor(ContextCompat.getColor(ctx, R.color.purple_500))
            holder.imagem.setBackgroundResource(R.drawable.ic_baseline_person_24)
        }
    }

    // Devolve quantidade de itens do nameList
    override fun getItemCount(): Int {
        return nameList.size
    }

    // Aqui é a criação dos itens do viewholder
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var name = view.findViewById<TextView>(R.id.text_titulo)
        var imagem = view.findViewById<ImageView>(R.id.caonatal)
    }
}
