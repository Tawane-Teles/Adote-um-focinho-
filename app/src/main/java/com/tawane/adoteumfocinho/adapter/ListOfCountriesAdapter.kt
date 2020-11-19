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
import com.tawane.adoteumfocinho.utils.Constant.BRASIL
import com.tawane.adoteumfocinho.utils.Constant.CANADA
import com.tawane.adoteumfocinho.utils.Constant.CHINA
import com.tawane.adoteumfocinho.utils.Constant.ESTADOSUNIDOS
import com.tawane.adoteumfocinho.utils.Constant.RUSSIA

class ListOfCountriesAdapter(nameList: List<String>, private var ctx: Context) :
        RecyclerView.Adapter<ListOfCountriesAdapter.ViewHolder>() {

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

        if (name == BRASIL ) {
            holder.name.setTextColor(ContextCompat.getColor(ctx, R.color.purple_200))
            holder.imagem.setBackgroundResource(R.drawable.img_brasil)
        }
        if (name == RUSSIA) {
            holder.name.setTextColor(ContextCompat.getColor(ctx, R.color.purple_500))
            holder.imagem.setBackgroundResource(R.drawable.img_russia)
        }
        if (name == CANADA) {
            holder.name.setTextColor(ContextCompat.getColor(ctx, R.color.purple_700))
            holder.imagem.setBackgroundResource(R.drawable.img_canada)
        }
        if (name == CHINA) {
            holder.name.setTextColor(ContextCompat.getColor(ctx, R.color.teal_200))
            holder.imagem.setBackgroundResource(R.drawable.img_china)
        }
    }

    // Devolve quantidade de itens do nameList
    override fun getItemCount(): Int {
        return nameList.size
    }

    // Aqui é a criação dos itens do viewholder
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var name = view.findViewById<TextView>(R.id.txt_titulo)
        var imagem = view.findViewById<ImageView>(R.id.img_paises)
    }
}
