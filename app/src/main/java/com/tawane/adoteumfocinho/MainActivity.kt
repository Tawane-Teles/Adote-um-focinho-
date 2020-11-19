package com.tawane.adoteumfocinho

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tawane.adoteumfocinho.adapter.ListOfCountriesAdapter
import com.tawane.adoteumfocinho.utils.Constant.CANADA
import com.tawane.adoteumfocinho.utils.Constant.CHINA
import com.tawane.adoteumfocinho.utils.Constant.ESTADOSUNIDOS
import com.tawane.adoteumfocinho.utils.Constant.RUSSIA
import com.tawane.adoteumfocinho.utilsdois.ConstantDois.BRAZILDOIS

class MainActivity : AppCompatActivity() {
    var listaAdapter: ListOfCountriesAdapter? = null
    var linearLayoutManager: LinearLayoutManager? = null
    var nameList = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val list: RecyclerView = findViewById(R.id.list_dogs)

        getDogs()
        listaAdapter = ListOfCountriesAdapter(nameList, this)
        linearLayoutManager = LinearLayoutManager(this)
        list.layoutManager = linearLayoutManager
        list.adapter = listaAdapter
        list.adapter
    }

    private fun getDogs() {
        nameList.add(BRAZILDOIS)
        nameList.add(RUSSIA)
        nameList.add(CANADA)
        nameList.add(CHINA)
        nameList.add(ESTADOSUNIDOS)
    }

}
