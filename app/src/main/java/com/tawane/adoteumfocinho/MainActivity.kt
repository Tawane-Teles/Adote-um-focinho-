package com.tawane.adoteumfocinho

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tawane.adoteumfocinho.adapter.ListaAdapter

class MainActivity : AppCompatActivity() {
    var listaAdapter: ListaAdapter? = null
    var linearLayoutManager: LinearLayoutManager? = null
    var nameList = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val list: RecyclerView = findViewById(R.id.list_dogs)

        getDogs()
        listaAdapter = ListaAdapter(nameList, this)
        linearLayoutManager = LinearLayoutManager(this)
        list.layoutManager = linearLayoutManager
        list.adapter = listaAdapter
        list.adapter
    }

    private fun getDogs() {
        nameList.add("Amora")
        nameList.add("Junior")
        nameList.add("Ane")
        nameList.add("Tiaguinho")
    }
}