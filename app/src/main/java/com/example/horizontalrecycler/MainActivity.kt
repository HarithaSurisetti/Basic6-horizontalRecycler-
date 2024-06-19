package com.example.horizontalrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var  recyclerView: RecyclerView
    private lateinit var foodList: ArrayList<Food>
    private lateinit var foodAdaptor: FoodAdaptor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }
    private fun  init(){
        recyclerView= findViewById(R.id.recycleView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager=LinearLayoutManager(this,RecyclerView.HORIZONTAL,false)
        foodList= ArrayList()
        val snapHelper =LinearSnapHelper()
        snapHelper.attachToRecyclerView(recyclerView)
        addDataToList()
        foodAdaptor = FoodAdaptor(foodList)
        recyclerView.adapter=foodAdaptor
    }

    private fun addDataToList(){
        foodList.add(Food(R.drawable.product1,"product1"))
        foodList.add(Food(R.drawable.product2,"product2"))
        foodList.add(Food(R.drawable.product3,"product3"))
        foodList.add(Food(R.drawable.product4,"product4"))

    }
}