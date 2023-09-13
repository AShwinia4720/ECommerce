package com.androidlearning.ecommerce

import Model.ProductMainPage
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.View
import android.view.View.OnClickListener
import androidx.core.view.marginLeft
import androidx.recyclerview.widget.GridLayoutManager
import com.androidlearning.ecommerce.Adapter.ProductMainPageAdapter
import com.androidlearning.ecommerce.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val products=ArrayList<ProductMainPage>()
    private lateinit var productMainPageAdapter: ProductMainPageAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        productsInput()
        inThisView()

    }

    
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater
        menuInflater.inflate(R.menu.menu, menu)
        return true

    }

    private fun inThisView(){
        productMainPageAdapter = ProductMainPageAdapter(products)

        binding.recyclerMainProductPage.adapter=productMainPageAdapter
        binding.recyclerMainProductPage.layoutManager=GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false)
    }



    fun productsInput(){
        products.add(ProductMainPage(1,"HP Laptop",100000.00,"HP warrenty","Ram : 8gb, Storage : 256ssd, os : Ios",R.drawable.laptop))
        products.add(ProductMainPage(2,"Asus Laptop",80000.0,"Asus warrenty","Ram:16gb",R.drawable.laptop))
        products.add(ProductMainPage(3,"Lenovo Laptop",70000.0,"Lenovo warrenty","Ram:16gb",R.drawable.laptop))
        products.add(ProductMainPage(4,"Acer Laptop",75000.00,"Acer warrenty","Ram:4gb",R.drawable.laptop))
        products.add(ProductMainPage(5,"Dell Laptop",80000.00,"Dell warrenty","Ram:16gb",R.drawable.laptop))
    }



}








