package com.app1.recyclerview2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        val items = ArrayList<Person>()
        items.add(Person("Mika", "Android", "378463367340103", R.drawable.user))
        items.add(Person("Mika", "Android", "378463367340103", R.drawable.user))
        items.add(Person("Mika", "Android", "378463367340103", R.drawable.user))
        items.add(Person("Mika", "Android", "378463367340103", R.drawable.user))
        items.add(Person("Mika", "Android", "378463367340103", R.drawable.user))
        items.add(Person("Mika", "Android", "378463367340103", R.drawable.user))



        val persons = findViewById<RecyclerView>(R.id.recycler_persons)
//        var adapter = Adapter(items, applicationContext)
        println("this@MainActivity:" + this@MainActivity) //this@MainActivity:com.app1.recyclerview2.MainActivity@82fb4b8
        println("applicationContext:" + applicationContext) //applicationContext:android.app.Application@dfb8a6
        var adapter = Adapter(items, this@MainActivity)

        persons.layoutManager = GridLayoutManager(this@MainActivity, 2)
        persons.adapter = adapter

    }

}
