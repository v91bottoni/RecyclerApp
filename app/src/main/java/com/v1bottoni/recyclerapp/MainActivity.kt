package com.v1bottoni.recyclerapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.v1bottoni.recyclerapp.adapter.StringAdapter
import com.v1bottoni.recyclerapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listaString = listOf<String>("Pippo", "Pluto", "Topolino", "Paperino")
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = StringAdapter(listaString){
            Toast.makeText(this, it, Toast.LENGTH_LONG).show()
        }

    }
}